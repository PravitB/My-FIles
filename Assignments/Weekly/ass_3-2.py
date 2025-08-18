highest=0

# a=int(input("Enter first number "))
# highest=a
# b=int(input("Enter second number "))
# if b>highest:
#     highest=b
# c=int(input("Enter third number "))
# if c>highest:
#     highest=c

# yes='y'
# while yes in "yY":

for i in range(3):
    num=int(input("Enter number "))
    if num>highest:
        highest=num

    # yes=input("Compare more numbers? y/n")
    
print("Highest number is", highest)