n=int(input('Enter range'))
sum=0
d=2
for i in range(2,n+d,d):
    sum+=(1/i)
print(sum)