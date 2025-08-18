numbers=[]
n=1
while n!=0:
	n=int(input('Enter integer'))
	numbers.append(n)
print(sum(numbers)/len(numbers))