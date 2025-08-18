n=int(input('Enter a number'))
arm=0
for i in range(len(str(n))):
    digit = int(str(n)[i])
    arm+=digit**3

if arm == n:
    print(n, 'is an Armstrong number')
else:
    print(n, 'is not an Armstrong number')