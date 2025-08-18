nums=eval(input("Enter 3 numbers"))
for i in nums:
    if i==nums[0]:
        lowest=i
        highest=i
    else:
        if i>=highest:
            highest=i
        elif i<=lowest:
            lowest=i    
print("largest number:", highest)
print("smallest number:", lowest)    