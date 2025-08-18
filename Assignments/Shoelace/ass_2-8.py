n=int(input('Enter a number'))
digits=len(str(n))
arm=0
for i in range(1,digits+1):
    if i == 1:
        digit=n%10
    else:
        digit=(n%10**i - n%10**(i-1))//(10**(i-1))
    arm+=digit**3

if arm == n:
    print(n, 'is an Armstrong number')
else:
    print(n, 'is not an Armstrong number')