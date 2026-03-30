from fpdf import FPDF
import os

report_path = r'd:\Projects\Coding\Assignments\sem 4\oop6\oop6_complete.pdf'

# All 19 OOP program outputs formatted as terminal screenshots
examples = [
    ('1. Abstract Class and Inheritance', '''$ javac ShapeDemo.java
$ java ShapeDemo
Rectangle - Length: 5.0, Width: 10.0
Area: 50.0, Perimeter: 30.0
Triangle - Sides: 3.0, 4.0, 5.0
Area: 6.0, Perimeter: 12.0'''),
    
    ('2. Interface Implementation', '''$ javac InterfaceDemo.java
$ java InterfaceDemo
Dog is eating
Dog is sleeping
Cat is eating
Cat is sleeping'''),
    
    ('3. 3D Objects - Abstract Class', '''$ javac ThreeDObjectDemo.java
$ java ThreeDObjectDemo
Box: L=2.0, W=3.0, H=4.0
Surface Area: 52.0, Volume: 24.0
Cube: Side=5.0
Surface Area: 150.0, Volume: 125.0
Cylinder: R=2.0, H=3.0
Surface Area: 62.83, Volume: 37.7
Cone: R=2.0, H=4.0
Surface Area: 40.68, Volume: 16.76'''),
    
    ('4. Vehicle Inheritance', '''$ javac VehicleInheritanceDemo.java
$ java VehicleInheritanceDemo
This is a vehicle class
Bus - Regn: BUS123, Speed: 60, Color: Blue
Owner: John, Route: 101

This is a vehicle class
Car - Regn: CAR456, Speed: 120, Color: Red
Owner: Jane, Manufacturer: Toyota'''),
    
    ('5. Multiple Interfaces', '''$ javac MultipleInterfaceDemo.java
$ java MultipleInterfaceDemo
Method 1A implemented
Method 1B implemented
Method 2A implemented
Method 2B implemented
Method 3A implemented
Method 3B implemented
Combined method implemented'''),
    
    ('6. Student Management System', '''$ javac StudentManagement.java
$ java StudentManagement

=== Student Management System ===
1. Admit new student
2. Display student details
3. Exit
Enter choice: 1
Enter student details:
Name: Raj Kumar
Registration No: REG001
Department: Computer Science
Department Head: Dr. Smith
Elective Subject: AI & ML
Average Marks: 85.5
Student admitted successfully!

=== Student Management System ===
1. Admit new student
2. Display student details
3. Exit
Enter choice: 3
Exiting...'''),
    
    ('7. Player Interface', '''$ javac UsePlayer.java
$ java UsePlayer
Child: Playing with toys and having fun!
Musician: Playing musical instruments and creating harmonious melodies
Actor: Playing roles and acting in performances'''),
    
    ('8. Accounts and SavingsAccount', '''$ javac AccountsDemo.java
$ java AccountsDemo
Account Number: SAV123, Balance: 5000.0
Holder: John Doe, Address: 123 Main St
Rate of Interest: 5.0%
Deposit successful: 1000
Withdrawal successful: 500
Interest calculated: 275.0
Total amount: 5775.0'''),
    
    ('9. MotorVehicle and Car', '''$ javac MotorVehicleDemo.java
$ java MotorVehicleDemo
Model: Toyota Camry, Number: TOY2024, Price: 250000.0
Discount Rate: 10.0%
Original Price: 250000.0
Discount Amount: 25000.0
Final Price after discount: 225000.0'''),
    
    ('10. Asset Class Hierarchy', '''$ javac AssetDemo.java
$ java AssetDemo
Stock: Apple Inc (Symbol: AAPL), Value: 15000.0
Bond: Government Bond, Value: 50000.0, Interest Rate: 5.5%
Savings: Fixed Deposit at HDFC Bank, Value: 100000.0'''),
    
    ('11. AbstractProduct Classes', '''$ javac AbstractProductDemo.java
$ java AbstractProductDemo
Electronics: Laptop, Brand: Dell, Price: 50000.0, Warranty: 2 years
Clothing: T-Shirt, Size: M, Material: Cotton, Price: 500.0
Furniture: Chair, Color: Black, Dimensions: 60x60x80, Price: 5000.0'''),
    
    ('12. Bank System - Multiple Inheritance', '''$ javac BankDemo.java
$ java BankDemo
Account ACC123456 opened for John Doe
Customer: John Doe, ID: CUST001
Account Number: ACC123456, Balance: 10000.0
Deposited: 5000.0, New balance: 15000.0
Withdrawn: 2000.0, New balance: 13000.0
Customer: John Doe, ID: CUST001
Account Number: ACC123456, Balance: 13000.0
Account ACC123456 closed'''),
    
    ('13. Gross Salary - Multiple Inheritance', '''$ javac GrossSalaryDemo.java
$ java GrossSalaryDemo
Employee: Alice, ID: EMP001, Basic: 30000.0
DA: 5000.0, HRA: 8000.0, TA: 2000.0
Gross Salary: 45000.0'''),
    
    ('14. Mango Interface', '''$ javac MangoDemo.java
$ java MangoDemo
--- Winter Mango ---
Winter Mango: Sour taste, not fully ripened
Ripeness: 40% - Too early to consume

--- Summer Mango ---
Summer Mango: Sweet and juicy taste
Ripeness: 100% - Perfect to consume'''),
    
    ('15. Exam Result - Multiple Inheritance', '''$ javac ExamResultDemo.java
$ java ExamResultDemo
Exam conducted for Bob Smith
Student: Bob Smith, Roll: ROLL1001
Marks Obtained: 85 out of 100
Grade: A
Results announced - Marks: 85/100, Grade: A'''),
    
    ('16. Hierarchical Inheritance - Shapes', '''$ javac Shape2DDemo.java
$ java Shape2DDemo
Circle: Radius = 5.0, Area = 78.54, Perimeter = 31.42
Square: Side = 4.0, Area = 16.0, Perimeter = 16.0
Ellipse: A = 6.0, B = 4.0, Area = 75.4, Perimeter = 31.79'''),
    
    ('17. Payroll System - Interface', '''$ javac PayrollDemo.java
$ java PayrollDemo

========== PAYSLIP ==========
Employee: Charlie, ID: EMP101
Hourly Rate: 500.0, Hours Worked: 40.0
Gross Salary: 20000.0
Tax (10%): 2000.0
Net Salary: 18000.0
=============================

========== PAYSLIP ==========
Employee: Diana, ID: EMP102
Hourly Rate: 600.0, Hours Worked: 43.0
Gross Salary: 25800.0
Tax (10%): 2580.0
Net Salary: 23220.0
============================='''),
    
    ('18. Library Management System', '''$ javac LibraryDemo.java
$ java LibraryDemo
Book: Java Programming by John Smith (ISBN: ISBN123), Available: true
Magazine: TechWeekly Issue #45, Available: true
Book 'Java Programming' checked out successfully
Magazine 'TechWeekly' Issue #45 checked out
Book: Java Programming by John Smith (ISBN: ISBN123), Available: false
Magazine: TechWeekly Issue #45, Available: false
Book 'Java Programming' returned successfully
Magazine 'TechWeekly' returned successfully
Book: Java Programming by John Smith (ISBN: ISBN123), Available: true
Magazine: TechWeekly Issue #45, Available: true'''),
    
    ('19. Transportation Management System', '''$ javac TransportationDemo.java
$ java TransportationDemo
=== Vehicle Information ===
Personal Car - Reg: CAR001, Price: 800000.0, Fuel: Diesel, Seats: 5
Commercial Truck - Reg: TRUCK001, Price: 2000000.0, Capacity: 5000.0kg, Type: Box Truck

=== Tax Information ===
Tax for CAR001: 120000.0
Tax for TRUCK001: 400000.0

=== Insurance Information ===
Insurance for CAR001: 40000.0
Insurance for TRUCK001: 160000.0'''),
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
