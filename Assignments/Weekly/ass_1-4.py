n1=int(input("Enter 1st number "))
n2=int(input("Enter 2nd number "))
units1=n1%10
units2=n2%10
final1=(n1//10)*10+units2
final2=(n2//10)*10+units1
print(final1,'*',final2,"=",final1*final2)