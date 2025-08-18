n=int(input("Enter a number "))
units=n%10
tens=(n%100-units)//10
final=(n//100)*100+(units*10)+tens
print("Final number is",final)
    