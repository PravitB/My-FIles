operate='y'
num=int(input('Enter first number '))
while operate in 'yY':
    replace=int(input('Do you want to enter new first or second number '))
    if replace==1:
        num=int(input('Enter first number '))
    elif replace==2:    
        num2=int(input('Enter second number '))
    sum=num
    difference=num
    product=num
    quotient=num
    option=int(input('Enter 1,2,3,4 to +,-,*,/ '))
    if option==1:
        sum+=num2
        print(sum)
    elif option==2:
        difference-=num2
        print(difference)
    elif option==3:
        product*=num2
        print(product)
    elif option==4:
        if num2!=0:
            quotient//=num2
            print(quotient)
        else:
            print('Cannot divide by zero')
    operate=input('use another number? y/n ')