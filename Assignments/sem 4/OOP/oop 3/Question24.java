/* 24. Write a Java program to show 0-arguments constructor. */

class MyClass {
    int value;

    // 0-arguments constructor
    public MyClass() {
        value = 0;
        System.out.println("0-arguments constructor called");
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class Question24 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}