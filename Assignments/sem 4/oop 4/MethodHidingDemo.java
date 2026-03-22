// 4. Write a Java program to show method hiding.

class Parent {
    static void display() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child static method");
    }
}

public class MethodHidingDemo {
    public static void main(String[] args) {
        Parent.display(); // Calls Parent's display
        Child.display();  // Calls Child's display

        Parent ref = new Child();
        ref.display(); // Still calls Parent's display because it's static
    }
}