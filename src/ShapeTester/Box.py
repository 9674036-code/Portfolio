import math

class Box:
    def __init__(self,width,height,depth):
        self.width=width
        self.height=height
        self.depth=depth

    def calcVolume(self):
        return self.width*self.height*self.depth
    def calcSurface(self):
        return (self.width*self.height+self.width*self.depth+self.depth*self.height)*2
    def isFloat(self):
        ans=""
        try:
            float(self.width)
        except:
            ans+="Please use a valid number for the width. "
        else:
            self.width=float(self.width)
        try:
            float(self.height)
        except:
            ans+="Please use a valid number for the height. "
        else:
            self.height=float(self.height)
        try:
            float(self.depth)
        except:
            ans+="Please use a valid number for the depth. "
        else:
            self.depth=float(self.depth)
        return ans
