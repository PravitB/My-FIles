unit=int(input('Enter 1/2 to use celcius/fahrenheit as original unit'))
temp=int(input('Enter temperature'))
if unit==1:
    conv=(temp*(9/5))+32
if unit==2:
    conv=(temp-32)*(5/9)
print(conv)