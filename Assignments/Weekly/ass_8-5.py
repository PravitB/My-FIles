n=int(input('Enter a number'))
krishna=0
for i in range(len(str(n))):
    digit=int(str(n)[i])
    fact=1
    for j in range(1,digit+1):
        fact*=j
    krishna+=fact
if krishna==n:
    print(n,'is a krishnamurthy number')
else:
    print(n,'is not a krishnamurthy number')