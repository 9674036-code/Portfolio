import math

class Sphere:
    def __init__(self,radius):
        self.radius=radius
    def calcVolume(self):
        return (4*self.radius**3*math.pi)/3
    def calcSurface(self):
        return 4*math.pi*self.radius**2
    def isFloat(self):
        ans=""
        try:
            float(self.radius)
        except:
            ans="Please use a valid number for the radius. "
        else:
            self.radius=float(self.radius)
        return ans