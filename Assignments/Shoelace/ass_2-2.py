calls=int(input('Enter number of calls'))
if calls<=100:
    cost=200
elif calls>=100 and calls<=150:
    cost=200+((calls-100)*0.6)
elif calls>150 and calls<=200:
    cost=230+((calls-150)*0.5)
elif calls>200:
    cost=255+((calls-200)*0.4)
print(cost)