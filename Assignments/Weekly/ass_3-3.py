for i in range(3):
    num=int(input("Enter number "))
    if i==0:
        lowest=num
    else:
        if num<lowest:
            lowest=num
print("Lowest number is", lowest)