n=int(input('Enter nth day of the week'))

days = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
if n>0 and n<=7:
    print(days[n-1])
else:
    print('Invalid')