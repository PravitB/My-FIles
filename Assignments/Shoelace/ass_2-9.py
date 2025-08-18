n=int(input('Enter a number'))
digits=len(str(n))
krishna=0
for i in range(1,digits+1):
    if i == 1:
        digit=n%10
    else:
        digit=(n%10**i - n%10**(i-1))//(10**(i-1))
    fact=1
    for j in range(1,digit+1):
        fact*=j
    krishna+=fact
if krishna==n:
    print(n,'is a krishnamurthy number')
else:
    print(n,'is not a krishnamurthy number')