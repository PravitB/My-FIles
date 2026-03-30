/* 25. Write a Java program to show parameterized constructor. */

class MyClass {
    int value;

    // Parameterized constructor
    public MyClass(int val) {
        value = val;
        System.out.println("Parameterized constructor called with value: " + val);
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class Question25 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        obj.display();
    }
}