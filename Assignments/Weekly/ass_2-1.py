import math
a=int(input("Enter First Side "))
b=int(input("Enter Second Side "))
c=int(input("Enter Third Side "))
s=(a+b+c)/2
Area=math.sqrt(s*(s-a)*(s-b)*(s-c))
print("Area 5=",Area,"cm")