marks=int(input("Enter marks"))
if marks>=90:
    print("E Grade Achieved")
elif marks<=89 and marks>=80:
    print("A Grade Achieved")
elif marks<=79 and marks>=70:
    print("B Grade Achieved")
elif marks<=69 and marks>=60:
    print("C Grade Achieved")
elif marks<=59 and marks>=50:
    print("D Grade Achieved")
elif marks<=49 and marks>=35:
    print("P Grade Achieved")
elif marks<35:
    print("F Grade Achieved")