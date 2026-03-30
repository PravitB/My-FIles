/* 26. Write a Java program to show constructor overloading. */

class MyClass {
    int value;
    String name;

    // 0-arguments constructor
    public MyClass() {
        value = 0;
        name = "Default";
        System.out.println("0-arguments constructor called");
    }

    // Parameterized constructor with int
    public MyClass(int val) {
        value = val;
        name = "Default";
        System.out.println("Parameterized constructor with int called");
    }

    // Parameterized constructor with int and String
    public MyClass(int val, String n) {
        value = val;
        name = n;
        System.out.println("Parameterized constructor with int and String called");
    }

    public void display() {
        System.out.println("Value: " + value + ", Name: " + name);
    }
}

public class Question26 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.display();

        MyClass obj2 = new MyClass(10);
        obj2.display();

        MyClass obj3 = new MyClass(20, "Test");
        obj3.display();
    }
}