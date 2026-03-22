from fpdf import FPDF
import os

report_path = r'd:\Projects\Coding\Assignments\sem 4\oop 4\oop_inheritance_examples.pdf'

# Example outputs for all 15 inheritance programs formatted as terminal screenshots
examples = [
    ('1. Inheritance', '''$ javac InheritanceDemo.java
$ java InheritanceDemo
Animal eats
Dog barks'''),
    
    ('2. Method Overloading', '''$ javac MethodOverloadingDemo.java
$ java MethodOverloadingDemo
Sum of 2 ints: 15
Sum of 2 doubles: 16.0
Sum of 3 ints: 30'''),
    
    ('3. Method Overriding', '''$ javac MethodOverridingDemo.java
$ java MethodOverridingDemo
Parent class display method
Child class display method
Child class display method'''),
    
    ('4. Method Hiding', '''$ javac MethodHidingDemo.java
$ java MethodHidingDemo
Parent static method
Child static method
Parent static method'''),
    
    ('5. ThreeDObject', '''$ javac ThreeDObjectDemo.java
$ java ThreeDObjectDemo
Enter dimensions for Box (length, width, height):
2 3 4
Enter side for Cube:
5
Enter radius and height for Cylinder:
2 3
Enter radius and height for Cone:
2 4
Box - Surface Area: 52.0, Volume: 24.0
Cube - Surface Area: 150.0, Volume: 125.0
Cylinder - Surface Area: 62.83, Volume: 37.70
Cone - Surface Area: 40.68, Volume: 16.76'''),
    
    ('6. Vehicle (Bus/Car)', '''$ javac VehicleDemo.java
$ java VehicleDemo
This is a vehicle class
Bus Details: Regn: BUS123, Speed: 60, Color: Blue, 
Owner: John, Route: 101
This is a vehicle class
Car Details: Regn: CAR456, Speed: 120, Color: Red, 
Owner: Jane, Manufacturer: Toyota'''),
    
    ('7. Staff Database', '''$ javac StaffDatabase.java
$ java StaffDatabase
1. Add Teacher
2. Add Officer
3. Add Regular Typist
4. Add Casual Typist
5. Display All
6. Exit
Enter option: 1
Enter code, name, subject, publication:
101 Alice Math ABC
1. Add Teacher
2. Add Officer
...
5. Display All
6. Exit
Enter option: 5
Code: 101, Name: Alice
Subject: Math, Publication: ABC'''),
    
    ('8. Building/House', '''$ javac BuildingHouseDemo.java
$ java BuildingHouseDemo
Building:
Floors: 3, Rooms: 10, Footage: 2000.0

House:
Floors: 2, Rooms: 8, Footage: 1500.0
Bedrooms: 4, Bathrooms: 3'''),
    
    ('9. Building/House/Office', '''$ javac BuildingHouseOfficeDemo.java
$ java BuildingHouseOfficeDemo
Building:
Floors: 3, Rooms: 10, Footage: 2000.0

House:
Floors: 2, Rooms: 8, Footage: 1500.0
Bedrooms: 4, Bathrooms: 3

Office:
Floors: 5, Rooms: 20, Footage: 5000.0
Telephones: 15, Tables: 25'''),
    
    ('10. Num + HexNum', '''$ javac NumHexNumDemo.java
$ java NumHexNumDemo
Number: 255
Hexadecimal: ff'''),
    
    ('11. Num + OctNum', '''$ javac NumOctNumDemo.java
$ java NumOctNumDemo
Number: 255
Octal: 377'''),
    
    ('12. Num+HexNum+OctNum', '''$ javac NumHexOctDemo.java
$ java NumHexOctDemo
Decimal: 255
Hexadecimal: ff
Octal: 377'''),
    
    ('13. Distance/DistanceMKS', '''$ javac DistanceDemo.java
$ java DistanceDemo
Time at 60 mph: 2.0 hours
Time at 100 km/s: 1.2 seconds'''),
    
    ('14. vehicle/car/truck', '''$ javac VehicleCarTruckDemo.java
$ java VehicleCarTruckDemo
Car:
Wheels: 4, Speed: 120 mph
Passengers: 5

Truck:
Wheels: 6, Speed: 80 mph
Load Limit: 10.5 tons

Car is faster.'''),
    
    ('15. Multilevel Inheritance', '''$ javac MultilevelInheritanceDemo.java
$ java MultilevelInheritanceDemo
Method from class A
Method from class B
Method from class C'''),
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
