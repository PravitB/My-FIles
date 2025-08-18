import math
scores=eval(input("Enter 5 scores"))
mean=sum(scores)/len(scores)
std_deviation=math.sqrt(sum((score - mean) ** 2 for score in scores) / len(scores))
print(mean, std_deviation)