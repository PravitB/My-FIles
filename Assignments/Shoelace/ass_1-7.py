ranges=eval(input('Enter range - lower, upper'))
for i in range(ranges[0],ranges[1]+1):
    if i>1:
        for j in range(2,i):
            if i%j==0:
                break
        else:
            print(i)