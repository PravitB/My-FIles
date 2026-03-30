// 7. An educational institution maintains a database of its employees. The database is divided into a number of classes whose hierarchical relationships are shown below. Write all the classes and define the methods to create the database and retrieve individual information as and when needed. Write a driver program to test the classes. Staff (code, name) Teacher (subject, publication) is a Staff Officer (grade) is a Staff Typist (speed) is a Staff RegularTypist (remuneration) is a Typist CasualTypist (daily wages) is a Typist.

import java.util.ArrayList;
import java.util.Scanner;

class Staff {
    protected int code;
    protected String name;

    Staff(int c, String n) {
        code = c;
        name = n;
    }

    void display() {
        System.out.println("Code: " + code + ", Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject;
    private String publication;

    Teacher(int c, String n, String sub, String pub) {
        super(c, n);
        subject = sub;
        publication = pub;
    }

    void display() {
        super.display();
        System.out.println("Subject: " + subject + ", Publication: " + publication);
    }
}

class Officer extends Staff {
    private String grade;

    Officer(int c, String n, String g) {
        super(c, n);
        grade = g;
    }

    void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    protected int speed;

    Typist(int c, String n, int s) {
        super(c, n);
        speed = s;
    }

    void display() {
        super.display();
        System.out.println("Speed: " + speed + " wpm");
    }
}

class RegularTypist extends Typist {
    private double remuneration;

    RegularTypist(int c, String n, int s, double rem) {
        super(c, n, s);
        remuneration = rem;
    }

    void display() {
        super.display();
        System.out.println("Remuneration: " + remuneration);
    }
}

class CasualTypist extends Typist {
    private double dailyWages;

    CasualTypist(int c, String n, int s, double dw) {
        super(c, n, s);
        dailyWages = dw;
    }

    void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
    }
}

public class StaffDatabase {
    private static ArrayList<Staff> staffList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Teacher\n2. Add Officer\n3. Add Regular Typist\n4. Add Casual Typist\n5. Display All\n6. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter code, name, subject, publication:");
                    staffList.add(new Teacher(sc.nextInt(), sc.next(), sc.next(), sc.next()));
                    break;
                case 2:
                    System.out.println("Enter code, name, grade:");
                    staffList.add(new Officer(sc.nextInt(), sc.next(), sc.next()));
                    break;
                case 3:
                    System.out.println("Enter code, name, speed, remuneration:");
                    staffList.add(new RegularTypist(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble()));
                    break;
                case 4:
                    System.out.println("Enter code, name, speed, daily wages:");
                    staffList.add(new CasualTypist(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble()));
                    break;
                case 5:
                    for (Staff s : staffList) {
                        s.display();
                        System.out.println();
                    }
                    break;
                case 6:
                    break;
            }
        } while (choice != 6);
    }
}