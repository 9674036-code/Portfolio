import math

class Pyramid:
    def __init__(self,height,width,length):
        self.width=width
        self.height=height
        self.length=length
    def calcVolume(self):
        return (self.length*self.width*self.height)/3
    def calcSurface(self):
        return self.length*self.width+(math.sqrt((self.width/2)**2+(self.height)**2)*2*self.length)
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
            float(self.length)
        except:
            ans+="Please use a valid number for the length. "
        else:
            self.length=float(self.length)
        return ans