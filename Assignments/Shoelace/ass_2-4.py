n=int(input('Enter number of terms'))
fibo=0
num1=0
num2=1
for i in range(1,n+1):
    fibo=num1+num2
    num2=num1
    num1=fibo
print(fibo)