x=int(input('Enter 1st number'))
y=int(input('Enter 2nd number'))
factorx=[]
factory=[]
hcf=1
for i in range(1,x+1):
	if x%i == 0:
		factorx.append(i)
for j in range(1,y+1):
	if y%j == 0:
		factory.append(j)
for i in factorx:
	if i in factory:
		if i>hcf:
			hcf=i
print(hcf)