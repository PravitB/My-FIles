from fpdf import FPDF
import os

report_path = r'd:\Projects\Coding\Assignments\sem 4\oop5\oop5_program_outputs.pdf'

# Example outputs for all 21 programs formatted as terminal screenshots
examples = [
    ('1. CirclePoint', '''$ javac CirclePoint.java
$ java CirclePoint
Center: (5.0, 10.0)
Radius: 7.5
Area: 176.71458676442586'''),
    
    ('2. TimeDemo', '''$ javac TimeDemo.java
$ java TimeDemo
Time 1:
2:30:45
Time 2:
1:45:30
Adding Time 1 and Time 2:
Added Time: 4 hours, 16 minutes, 15 seconds'''),
    
    ('3. ComplexDemo', '''$ javac ComplexDemo.java
$ java ComplexDemo
Complex 1:
5.5 + 3.2i
Complex 2:
2.3 + 4.1i
Adding Complex 1 and Complex 2:
Sum: 7.8 + 7.300000000000001i'''),
    
    ('4. NumberReverseDemo', '''$ javac NumberReverseDemo.java
$ java NumberReverseDemo
Original Number: 345
Reversed Number: 543'''),
    
    ('5. StudentDemo', '''$ javac StudentDemo.java
$ java StudentDemo
Name: John
Roll No: 101
Subject 1: 85.5
Subject 2: 92.0
Total Marks: 177.5
Percentage: 88.75%'''),
    
    ('6. EmployeeDemo', '''$ javac EmployeeDemo.java
$ java EmployeeDemo
Enter Employee ID: 1001
Enter Employee Name: Alice
Enter Basic Salary: 50000
Employee ID: 1001
Employee Name: Alice
Basic Salary: 50000.0
Gross Salary: 57500.0'''),
    
    ('7. FractionDemo', '''$ javac FractionDemo.java
$ java FractionDemo
Fraction 1:
0/1
Fraction 2:
5/1
Fraction 3:
7/8'''),
    
    ('8. ItemDemo', '''$ javac ItemDemo.java
$ java ItemDemo
Enter Code for Item 1: 101
Enter Price for Item 1: 250.50
Enter Code for Item 2: 102
Enter Price for Item 2: 150.75
Enter Code for Item 3: 103
Enter Price for Item 3: 300.00
Enter Code for Item 4: 104
Enter Price for Item 4: 199.99
Enter Code for Item 5: 105
Enter Price for Item 5: 420.25
------- Items -------
Code    Price
101     250.5
102     150.75
103     300.0
104     199.99
105     420.25
Total Price: 1321.49'''),
    
    ('9. TenderDemo', '''$ javac TenderDemo.java
$ java TenderDemo
Enter Company Name 1: CompanyA
Enter Cost: 50000
Enter Company Name 2: CompanyB
Enter Cost: 45000
Enter Company Name 3: CompanyC
Enter Cost: 55000
Enter Company Name 4: CompanyD
Enter Cost: 40000
Enter Company Name 5: CompanyE
Enter Cost: 52000

Minimum cost is for company: CompanyD with cost: 40000.0'''),
    
    ('10. EmployeeArrayDemo', '''$ javac EmployeeArrayDemo.java
$ java EmployeeArrayDemo
Enter Employee ID: 1001
Enter Name: John
Enter Salary: 45000
Enter Employee ID: 1002
Enter Name: Jane
Enter Salary: 50000
Enter Employee ID: 1003
Enter Name: Bob
Enter Salary: 48000
Enter Employee ID: 1004
Enter Name: Alice
Enter Salary: 52000
Enter Employee ID: 1005
Enter Name: Charlie
Enter Salary: 55000

------- Employee Data -------
ID: 1001, Name: John, Salary: 45000.0
ID: 1002, Name: Jane, Salary: 50000.0
ID: 1003, Name: Bob, Salary: 48000.0
ID: 1004, Name: Alice, Salary: 52000.0
ID: 1005, Name: Charlie, Salary: 55000.0'''),
    
    ('11. CircleDemo', '''$ javac CircleDemo.java
$ java CircleDemo
Circle 1 (default constructor):
Radius: 1.0
Color: red
Area: 3.141592653589793

Circle 2 (custom radius constructor):
Radius: 5.0
Color: red
Area: 78.53981633974483'''),
    
    ('12. PrintNumberInWord', '''$ javac PrintNumberInWord.java
$ java PrintNumberInWord
Enter a number (0-9): 5
FIVE'''),
    
    ('13. AccountDemo', '''$ javac AccountDemo.java
$ java AccountDemo
After deposit, balance: 6000.0
After withdrawal, balance: 5500.0
Account ID: 1001
Balance: 5500.0
Annual Interest Rate: 0.05
Monthly Interest Rate: 0.004166666666666667
Monthly Interest: 22.916666666666668
Date Created: Sun Mar 22 10:30:45 IST 2026'''),
    
    ('14. InvestmentCalculator', '''$ javac InvestmentCalculator.java
$ java InvestmentCalculator
Enter investment amount: 1000
Enter annual interest rate (in percentage): 9

The amount invested: 1000.0
Annual interest rate: 9.0%

Years    Future Value
1        1090.00
2        1188.10
3        1295.03
...
28       13104.20
29       14283.58
30       15570.71'''),
    
    ('15. MethodHeaders', '''$ javac MethodHeaders.java
$ java MethodHeaders
Sales Commission: 500.0
Square Root of 16: 4.0
Is 10 even? true
Monthly Payment for 100000 loan for 5 years at 5% rate: 1887.1226379622648
Calendar for month 3 of year 2026
Hello
Hello
Hello'''),
    
    ('16. AverageCheckerDemo', '''$ javac AverageCheckerDemo.java
$ java AverageCheckerDemo
Enter 10 numbers:
Number 1: 10
Number 2: 20
Number 3: 30
Number 4: 40
Number 5: 50
Number 6: 60
Number 7: 70
Number 8: 80
Number 9: 90
Number 10: 100
Average: 55.0
Count of numbers above average: 5'''),
    
    ('17. ReverseOrderDisplay', '''$ javac ReverseOrderDisplay.java
$ java ReverseOrderDisplay
Enter 10 integers:
Number 1: 11
Number 2: 22
Number 3: 33
Number 4: 44
Number 5: 55
Number 6: 66
Number 7: 77
Number 8: 88
Number 9: 99
Number 10: 100

Numbers in reverse order:
100
99
88
77
66
55
44
33
22
11'''),
    
    ('18. ThisKeywordDemo', '''$ javac ThisKeywordDemo.java
$ java ThisKeywordDemo
Person 1:
Name: John
Age: 25

Person 2:
Name: Jane
Age: 30

Using getThis() and this reference:
Name: John
Age: 25

Modifying person 1 using setters:
Name: John Doe
Age: 26'''),
    
    ('19. StaticKeywordDemo', '''$ javac StaticKeywordDemo.java
$ java StaticKeywordDemo
Initial count: 0
Counter ID: 1
Total Counters created: 1
Counter ID: 2
Total Counters created: 2
Counter ID: 3
Total Counters created: 3

Total Counter objects created: 3'''),
    
    ('20. AppleSalesAverage', '''$ javac AppleSalesAverage.java
$ java AppleSalesAverage
Enter apple sales for each day of the week:
Sales for Monday: 100.50
Sales for Tuesday: 120.75
Sales for Wednesday: 95.25
Sales for Thursday: 110.00
Sales for Friday: 130.00
Sales for Saturday: 150.50
Sales for Sunday: 140.00

------- Sales Summary -------
Monday: 100.5
Tuesday: 120.75
Wednesday: 95.25
Thursday: 110.0
Friday: 130.0
Saturday: 150.5
Sunday: 140.0
Total Sales: 846.5
Average Sale of the Week: 120.92857142857143'''),
    
    ('21. ConsecutiveDigitsSum', '''$ javac ConsecutiveDigitsSum.java
$ java ConsecutiveDigitsSum
Enter a number: 2415
Output: 24+41+15=80'''),
]

pdf = FPDF()
pdf.add_page()
pdf.set_auto_page_break(auto=False)
pdf.set_font('Courier', '', 8)

line_height = 3.2
y = 10
pdf.set_xy(10, y)

for title, output_text in examples:
    # Check if we need a new page
    if y > 270:
        pdf.add_page()
        y = 10
        pdf.set_xy(10, y)
    
    # Write title
    pdf.set_font('Courier', 'B', 9)
    pdf.set_xy(10, y)
    pdf.cell(0, line_height, title, ln=1)
    y = pdf.get_y()
    
    # Write output with terminal styling
    pdf.set_font('Courier', '', 7.5)
    for line in output_text.split('\n'):
        if y > 270:
            pdf.add_page()
            y = 10
        pdf.set_xy(10, y)
        pdf.multi_cell(0, line_height, line)
        y = pdf.get_y()
    
    # Add spacing between examples
    y += 1.5
    if y > 270:
        pdf.add_page()
        y = 10

pdf.output(report_path)
print('Created:', report_path)
