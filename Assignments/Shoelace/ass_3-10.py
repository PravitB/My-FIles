cont='y'
pos,neg,zero=0,0,0
while cont in 'yY':
	n=int(input('Enter number'))
	if n>0:
		pos+=1
	elif n<0:
		neg+=1
	else:
		zero+=1
	cont=input('Continue y/n?')
print(pos, neg, zero)