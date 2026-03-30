// 5. Write a program to define a class Student with four data members such as name, roll no., sub1, and sub2. Define appropriate methods to initialize and display the values of data members. Also calculate total marks and percentage scored by student.

class Student {
    private String name;
    private int rollNo;
    private double sub1, sub2;

    Student(String name, int rollNo, double sub1, double sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    double getTotalMarks() {
        return sub1 + sub2;
    }

    double getPercentage() {
        return getTotalMarks() / 2;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Percentage: " + getPercentage() + "%");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("John", 101, 85.5, 92.0);
        s.display();
    }
}