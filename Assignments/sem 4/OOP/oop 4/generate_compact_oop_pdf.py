from fpdf import FPDF
import os

report_path = r'd:\Projects\Coding\Assignments\sem 4\oop 4\oop_inheritance_examples.pdf'
examples = [
    ('1. Inheritance', 'Animal eats\nDog barks'),
    ('2. Method Overloading', 'Sum of 2 ints: 15\nSum of 2 doubles: 16.0\nSum of 3 ints: 30'),
    ('3. Method Overriding', 'Parent class display method\nChild class display method\nChild class display method'),
    ('4. Method Hiding', 'Parent static method\nChild static method\nParent static method'),
    ('5. ThreeDObject', 'Input example: Box(2,3,4), Cube(5), Cylinder(2,3), Cone(2,4)\nBox - Surface Area: 52.0, Volume: 24.0\nCube - Surface Area: 150.0, Volume: 125.0\nCylinder - Surface Area: 62.83185307179586, Volume: 37.69911184307752\nCone - Surface Area: 40.677878155483586, Volume: 16.755160819145562'),
    ('6. Vehicle (Bus/Car)', 'This is a vehicle class\nBus Details: Regn: BUS123, Speed: 60, Color: Blue, Owner: John, Route: 101\nThis is a vehicle class\nCar Details: Regn: CAR456, Speed: 120, Color: Red, Owner: Jane, Manufacturer: Toyota'),
    ('7. Staff Database', 'Sample entries and display listing: Staff: code=100, name=Alice\nTeacher: code=101, name=Bob, subject=Math, publication=ABC\nOfficer: code=102, name=Carol, grade=A\nRegularTypist: code=103, name=Dave, speed=70, remuneration=25000\nCasualTypist: code=104, name=Eve, speed=50, daily wages=500'),
    ('8. Building/House', 'Building: Floors: 3, Rooms: 10, Footage: 2000.0\nHouse: Floors: 2, Rooms: 8, Footage: 1500.0\nBedrooms: 4, Bathrooms: 3'),
    ('9. Building/House/Office', 'Building: Floors: 3, Rooms: 10, Footage: 2000.0\nHouse: Floors: 2, Rooms: 8, Footage: 1500.0\nBedrooms: 4, Bathrooms: 3\nOffice: Floors: 5, Rooms: 20, Footage: 5000.0\nTelephones: 15, Tables: 25'),
    ('10. Num + HexNum', 'Number: 255\nHexadecimal: ff'),
    ('11. Num + OctNum', 'Number: 255\nOctal: 377'),
    ('12. Num+HexNum+OctNum', 'Decimal: 255\nHexadecimal: ff\nOctal: 377'),
    ('13. Distance/DistanceMKS', 'Time at 60 mph: 2.0 hours\nTime at 100 km/s: 1.2 seconds'),
    ('14. vehicle/car/truck', 'Car: Wheels: 4, Speed: 120 mph, Passengers: 5\nTruck: Wheels: 6, Speed: 80 mph, Load Limit: 10.5 tons\nCar is faster.'),
    ('15. Multilevel Inheritance', 'Method from class A\nMethod from class B\nMethod from class C'),
]

pdf = FPDF()
pdf.add_page()
pdf.set_auto_page_break(auto=False)
pdf.set_font('Arial', '', 9)

line_height = 4
y = 10
pdf.set_xy(10, y)
for title, text in examples:
    pdf.set_xy(10, y)
    pdf.set_font('Arial', 'B', 9)
    pdf.cell(0, line_height, title, ln=1)
    y = pdf.get_y()
    pdf.set_font('Arial', '', 8)
    for line in text.split('\n'):
        pdf.set_xy(10, y)
        pdf.multi_cell(0, line_height, line)
        y = pdf.get_y()
    y += 1
    if y > 270:  # new page if needed
        pdf.add_page()
        y = 10

pdf.output(report_path)
print('Created', report_path)
