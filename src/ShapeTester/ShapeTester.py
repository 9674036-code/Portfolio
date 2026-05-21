import Box
import Sphere
import Pyramid
import sys
shapes=[]

while True:
    if input("Welcome to the Shape Tester, do you want to load a new shape? (Yes/No): ") == "Yes":
        shape=input("To build a box, input 1, to build a sphere," "input 2 and to build a pyramid, press 3. Please input the shape you want to build: ")
        if shape=="1":
            shapes.append(Box.Box(input("Please input the width: "),input("Please input the height: "),input("Please input the depth:")))
            print(shapes[len(shapes)-1].isFloat())
            print(f"The volume of your box is: {shapes[len(shapes)-1].calcVolume()}")
            print(f"The surface area of your box is: {shapes[len(shapes)-1].calcSurface()}")
        if shape=="2":
            shapes.append(Sphere.Sphere(input("Please input the radius: ")))
            print(shapes[len(shapes)-1].isFloat())
            print(f"The volume of your sphere is: {shapes[len(shapes)-1].calcVolume()}")
            print(f"The surface area of your sphere is: {shapes[len(shapes)-1].calcSurface()}")
        if shape=="3":
            shapes.append(Pyramid.Pyramid(input("Please input the width: "),input("Please input the height: "),input("Please input the length:")))
            print(shapes[len(shapes)-1].isFloat())
            print(f"The volume of your pyramid is: {shapes[len(shapes)-1].calcVolume()}")
            print(f"The surface area of your box is: {shapes[len(shapes)-1].calcSurface()}")
        if input("Do you want to save this shape? (Yes/No): ")!= "Yes":
            del shapes[-1]
            print("Shape deleted.")
        else:
            print("Shape saved.")

    if input("Do you want to load a previous shape? (Yes/No): ") == "Yes":
        for i in range(len(shapes)):
            print(f"{i} - {type(shapes[i]).__name__}")
        load=input("Which shape do you wish to load? (if the system printed 2 - Pyramid and the user wanted to call that shape, just return the number 2): ")
        try:
            int(load)
        except:
            print("Please use a number printed on the screen, terminating function…")
        else:
            load=int(load)
        if load in range(len(shapes)):
            print(f"The volume of your {type(shapes[load]).__name__} is: {shapes[load].calcVolume()}")
            print(f"The surface area of your {type(shapes[load]).__name__} is: {shapes[load].calcSurface()}")
        else:
            print("Please use a number printed on the screen, terminating function…") 
    if input("Do you want to build or load another shape? (Yes/No): ") != "Yes":
        sys.exit()
