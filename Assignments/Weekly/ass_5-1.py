y=int(input("Enter 1st number "))
z=int(input("Enter 2nd number "))
cont='y'
while cont in 'yY':
    x=int(input("Enter 0 to add, 1 to subtract, 2 to multiply, 3 to divide "))
    if x==0:
        print(y+z)
    elif x==1:
        print(y-z)
    elif x==2:
        print(y*z)
    elif x==3:
        print(y/z)
    else:
        print("Invalid operation")
    cont=input("Do another operation? y/n ")