import math
a=int(input("Enter a"))
b=int(input("Enter b"))
c=int(input("Enter c"))
dis=(b**2) - 4*a*c
if dis>0:
    root1= (-b+math.sqrt(dis)) / (2*a)
    root2= (-b-math.sqrt(dis)) / (2*a)
    print(root1,root2)
elif dis==0:
    root1= (-b+math.sqrt(dis)) / (2*a)
    print(root1)
else:
    root_real = -b / (2*a)
    root_complex = math.sqrt(-dis) / (2*a)  
    print(root_real,root_complex)