// 6. Create an interface Department containing attributes deptName and deptHead. Create a class Hostel and Student class extending Hostel and implementing Department interface.

import java.util.Scanner;
import java.util.ArrayList;

interface Department {
    void printDepartmentDetails();
}

class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int numberOfRooms;

    Hostel(String name, String location, int rooms) {
        hostelName = name;
        hostelLocation = location;
        numberOfRooms = rooms;
    }

    void printHostelDetails() {
        System.out.println("Hostel: " + hostelName + ", Location: " + hostelLocation + ", Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    private String studentName;
    protected String regdNo;
    private String deptName;
    private String deptHead;
    private String electiveSubject;
    private double avgMarks;

    Student(String name, String location, int rooms, String sName, String regNo, String dept, String head, String subject, double marks) {
        super(name, location, rooms);
        studentName = sName;
        regdNo = regNo;
        deptName = dept;
        deptHead = head;
        electiveSubject = subject;
        avgMarks = marks;
    }

    public void printDepartmentDetails() {
        System.out.println("Department: " + deptName + ", Head: " + deptHead);
    }

    void printStudentDetails() {
        System.out.println("Student: " + studentName + ", Regn: " + regdNo);
        System.out.println("Elective: " + electiveSubject + ", Avg Marks: " + avgMarks);
    }

    void display() {
        printHostelDetails();
        printDepartmentDetails();
        printStudentDetails();
    }
}

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<Student>();

    static void admitStudent(Scanner sc) {
        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Registration No: ");
        String regNo = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        System.out.print("Department Head: ");
        String head = sc.nextLine();
        System.out.print("Elective Subject: ");
        String subject = sc.nextLine();
        System.out.print("Average Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();

        Student s = new Student("Main Hostel", "Campus A", 100, name, regNo, dept, head, subject, marks);
        students.add(s);
        System.out.println("Student admitted successfully!\n");
    }

    static void searchAndDisplay(Scanner sc) {
        System.out.print("Enter Registration No to search: ");
        String regNo = sc.nextLine();

        for (Student s : students) {
            if (s.regdNo.equals(regNo)) {
                System.out.println("\nStudent Found:");
                s.display();
                return;
            }
        }
        System.out.println("Student not found!\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Admit new student");
            System.out.println("2. Display student details");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    admitStudent(sc);
                    break;
                case 2:
                    searchAndDisplay(sc);
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
