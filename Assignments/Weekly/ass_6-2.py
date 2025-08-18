import math
a=int(input("Enter 1st side "))
b=int(input("Enter 2nd side "))
c=int(input("Enter 3rd side "))
A=math.acos(((b**2)+(c**2)-(a**2))/(2*b*c))
print(math.degrees(A))