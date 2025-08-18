n=int(input('Enter a number'))
sum=0
for i in range(len(str(n))):
    digit=int(str(n)[i])
    sum+=digit
print(sum)