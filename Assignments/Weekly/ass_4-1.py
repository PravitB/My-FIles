n=int(input("Enter a number "))
hundreds=(n%1000-n%100)//100
units=n%10
final=(n//1000)*1000+(n%100-n%10)+(units*100)+hundreds
print("Final number is",final)