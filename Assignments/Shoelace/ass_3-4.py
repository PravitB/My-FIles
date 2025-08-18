n=int(input("Enter range"))
sum=1
for i in range(1,n+1):
	print(sum, end=' ')
	sum_of_digits=0
	for j in range(len(str(sum))):
		sum_of_digits+=int(str(sum)[j])
	sum+=sum_of_digits
