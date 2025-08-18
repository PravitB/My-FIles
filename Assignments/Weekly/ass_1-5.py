n=int(input("Enter a number "))
units=n%10
tens=(n%100-units)//10
print(tens+units)