import math 
option='Enter 1 for circle, 2 for triangle, 3 for rectangle'
if option == 1:
    radius = int(input('Enter radius'))
    area = 3.14 * radius**2
    circumference = 2*3.14*radius
    print('Area:', area)
    print('Circumference:', circumference)
elif option == 2:
    a=int(input("Enter 1st side "))
    b=int(input("Enter 2nd side "))
    c=int(input("Enter 3rd side "))
    s=(a+b+c)/2
    perimeter = a + b + c
    area = math.sqrt(s*(s-a)*(s-b)*(s-c))
    print('Area:', area)
    print('Perimeter:', perimeter)
elif option == 3:
    length=int(input("Enter length "))
    breadth=int(input("Enter breadth "))
    area=length*breadth
    perimeter=2*(length+breadth)
    print('Area:', area)
    print('Perimeter:', perimeter)
else:
    print('Invalid option')