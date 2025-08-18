even=[]
odd=[]
for i in range(1,51):
    if i % 2 == 0:
        even.append(i)
    else:
        odd.append(i)
print('Even:',even)
print('Odd:',odd)