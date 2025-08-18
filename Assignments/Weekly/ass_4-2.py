n=int(input("Enter A number "))
tens=2*((n%100-n%10)//10)
final=(n//100)*100+n%10+tens*10
print(final)