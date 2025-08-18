n=int(input('Enter a number'))
digits=len(str(n))
sum=0
for i in range(1,digits+1):
    if i == 1:
        digit=n%10
    else:
        digit=(n%10**i - n%10**(i-1))//(10**(i-1))
    sum+=digit
print(sum)