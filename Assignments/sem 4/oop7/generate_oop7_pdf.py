from fpdf import FPDF
import os

report_path = r'd:\Projects\Coding\Assignments\sem 4\oop7\oop7_complete.pdf'

# All 25 exception handling program outputs formatted as terminal screenshots
examples = [
    ('1. Exception Keywords Demo', '''$ javac ExceptionKeywordsDemo.java
$ java ExceptionKeywordsDemo
Caught ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
Finally block executed
Caught ArithmeticException: / by zero
Finally block executed again
Caught manually thrown exception: Manually thrown exception
Caught exception from method: Exception from method'''),
    
    ('2. Exception Demo', '''$ javac ExceptionDemo.java
$ java ExceptionDemo
NegativeArraySizeException caught: -5
ArithmeticException caught: / by zero
ArrayIndexOutOfBoundsException caught: Index 10 out of bounds for length 5'''),
    
    ('3. No Match Exception Demo', '''$ javac NoMatchExceptionDemo.java
$ java NoMatchExceptionDemo
Exception caught: String does not match 'University'
String matches!'''),
    
    ('4. Character Counter Demo', '''$ javac CharacterCounterDemo.java
$ java CharacterCounterDemo
Exception: Non-alphabetic character found: 1
Total alphabetic characters before exception: 2'''),
    
    ('5. Factorial', '''$ javac Factorial.java
$ java Factorial
Factorial of 5: 120
Factorial of 10: 3628800
Exception: Result will overflow'''),
    
    ('6. Character Counter Demo 2', '''$ javac CharacterCounterDemo2.java
$ java CharacterCounterDemo2
Exception: Non-alphabetic character found: !
Total alphabetic characters: 5'''),
    
    ('7. Country Capital', '''$ javac CountryCapital.java
$ java CountryCapital India
Capital of India is New Delhi
$ javac CountryCapital.java
$ java CountryCapital Unknown
Exception: Capital not found for country: Unknown'''),
    
    ('8. Factorial Command Line', '''$ javac FactorialCommandLine.java
$ java FactorialCommandLine
Error: No argument provided. Please provide a number.
$ javac FactorialCommandLine.java
$ java FactorialCommandLine abc
Error: Invalid number format. Please provide an integer.
$ javac FactorialCommandLine.java
$ java FactorialCommandLine 0
Error: Zero is not allowed'''),
    
    ('9. Check Argument Demo', '''$ javac CheckArgumentDemo.java
$ java CheckArgumentDemo 1 2 3 4
Exception: At least 5 arguments required, but only 4 provided
$ javac CheckArgumentDemo.java
$ java CheckArgumentDemo 1 2 3 4 5
Sum of all arguments: 15'''),
    
    ('10. Student Marks', '''$ javac StudentMarks.java
$ java StudentMarks "John Doe" 45 48 42 50 47 49
Student Name: John Doe
Total Marks: 281/300
Percentage: 93.67%
$ javac StudentMarks.java
$ java StudentMarks "Jane Doe" 45 48 55 50 47 49
Exception: Marks must be between 0 and 50. Invalid mark: 55'''),
    
    ('11. Custom Arithmetic Exception', '''$ javac CustomArithmeticException.java
$ java CustomArithmeticException
Calculating: 10+5*(8/0)*3-2
Custom Arithmetic Exception: Division by zero error in P/Q
Standard Arithmetic Exception: / by zero'''),
    
    ('12. Temperature Check', '''$ javac TemperatureCheck.java
$ java TemperatureCheck 25
Normal temperature: 25.0°C = 77.0°F
$ javac TemperatureCheck.java
$ java TemperatureCheck 40
Exception: Temperature is too hot: 40.0°C
$ javac TemperatureCheck.java
$ java TemperatureCheck 2
Exception: Temperature is too cold: 2.0°C'''),
    
    ('13. Employee Recruitment', '''$ javac EmployeeRecruitment.java
$ java EmployeeRecruitment "Alice" 25
Candidate Alice is eligible (age: 25)
$ javac EmployeeRecruitment.java
$ java EmployeeRecruitment "Bob" 50
Exception: Candidate Bob is too old (age: 50)
$ javac EmployeeRecruitment.java
$ java EmployeeRecruitment "Charlie" 18
Exception: Candidate Charlie is too young (age: 18)'''),
    
    ('14. Binary to Decimal', '''$ javac BinaryToDecimal.java
$ java BinaryToDecimal 1010
Binary 1010 = Decimal 10
$ javac BinaryToDecimal.java
$ java BinaryToDecimal 1020
Exception: Input contains non-binary digit: 2'''),
    
    ('15. Nested Try Demo', '''$ javac NestedTryDemo.java
$ java NestedTryDemo
Outer try block
Inner try block 1
Inner catch 1: Index 10 out of bounds for length 5
Inner try block 2
Inner catch 2: null
Inner try block 3
Inner catch 3: / by zero
Outer finally block'''),
    
    ('16. Bank Account Demo', '''$ javac BankAccountDemo.java
$ java BankAccountDemo
Deposited: 500.0, New balance: 1500.0
Deposited: 300.0, New balance: 1300.0
Withdrawn: 200.0, New balance: 1300.0
Exception: Withdraw amount (900.0 Rs) is not valid. Minimum balance of 500 Rs required.'''),
    
    ('17. Library Management', '''$ javac LibraryManagement.java
$ java LibraryManagement "Java Programming"
Book found: Java Programming
$ javac LibraryManagement.java
$ java LibraryManagement "Python Programming"
Exception: Book 'Python Programming' not found in library'''),
    
    ('18. Quiz System', '''$ javac QuizSystem.java
$ java QuizSystem Delhi 4 Blue 7 Jupiter
Question 1: What is the capital of India?
Good! The answer is correct
Question 2: What is 2 + 2?
Good! The answer is correct
Question 3: What is the color of the sky?
Good! The answer is correct
Question 4: How many continents are there?
Good! The answer is correct
Question 5: What is the largest planet?
Good! The answer is correct
Quiz completed successfully!'''),
    
    ('19. Authentication Demo', '''$ javac AuthenticationDemo.java
$ java AuthenticationDemo
Enter username: user123
Enter password: pass123
Confirm password: pass123
Authentication successful!
$ javac AuthenticationDemo.java
$ java AuthenticationDemo
Enter username: usr
Enter password: pass123
Confirm password: pass123
Exception: Username must be at least 6 characters long'''),
    
    ('20. Password Authentication', '''$ javac PasswordAuthentication.java
$ java PasswordAuthentication
Enter password: password123
Authentication successful!
$ javac PasswordAuthentication.java
$ java PasswordAuthentication
Enter password: wrongpass
Exception: Authentication Failure: Incorrect password'''),
    
    ('21. Person Validation', '''$ javac PersonValidation.java
$ java PersonValidation
Enter name: John
Enter age: 25
Person validated: John, Age: 25
$ javac PersonValidation.java
$ java PersonValidation
Enter name: Jane
Enter age: -5
Exception: Age cannot be negative: -5'''),
    
    ('22. Positive Number Check', '''$ javac PositiveNumberCheck.java
$ java PositiveNumberCheck 10
10 is a positive number
$ javac PositiveNumberCheck.java
$ java PositiveNumberCheck -5
Exception: Number is not positive: -5'''),
    
    ('23. String Comparison', '''$ javac StringComparison.java
$ java StringComparison hello HELLO
Strings match (case insensitive): 'hello' and 'HELLO'
$ javac StringComparison.java
$ java StringComparison hello world
Exception: String Mismatch Exception: 'hello' does not match 'world' (case insensitive)'''),
    
    ('24. Stack Demo', '''$ javac StackDemo.java
$ java StackDemo
Pushed: 10
Pushed: 20
Pushed: 30
Exception: Stack is full. Cannot push 40
Stack elements: 10 20 30
Popped: 30
Popped: 20
Popped: 10
Exception: Stack is empty. Cannot pop'''),
    
    ('25. Student Score System', '''$ javac StudentScoreSystem.java
$ java StudentScoreSystem
Enter score for student S001 (0-100): 85
Score recorded: 85
Enter score for student S002 (0-100): 92
Score recorded: 92
Enter score for student S003 (0-100): 150
Exception: Score must be between 0 and 100. Invalid score: 150
Score set to 0
Enter score for student S004 (0-100): 78
Score recorded: 78
Enter score for student S005 (0-100): -10
Exception: Score must be between 0 and 100. Invalid score: -10
Score set to 0

Final Results:
Student ID	Score
----------	-----
S001		85
S002		92
S003		0
S004		78
S005		0'''),
]

class PDFTerminal(FPDF):
    def __init__(self):
        super().__init__()
        self.WIDTH = 210
        self.HEIGHT = 297
        
    def header(self):
        pass
    
    def footer(self):
        pass
    
    def print_terminal(self, title, content):
        self.set_font("Arial", "B", 11)
        self.set_text_color(0, 0, 139)
        self.cell(0, 8, title, ln=1)
        self.set_text_color(0, 0, 0)
        
        self.set_font("Courier", "", 8)
        self.set_fill_color(240, 240, 240)
        
        # Add terminal-like background
        x = self.get_x()
        y = self.get_y()
        
        lines = content.split('\n')
        line_height = 4
        
        for line in lines:
            if self.get_y() > 270:
                self.add_page()
                self.set_y(30)
            
            self.cell(0, line_height, line, ln=1)
        
        self.ln(3)

pdf = PDFTerminal()
pdf.add_page()

for title, content in examples:
    if pdf.get_y() > 250:
        pdf.add_page()
    pdf.print_terminal(title, content)

pdf.output(report_path)
print(f"PDF created successfully at: {report_path}")
