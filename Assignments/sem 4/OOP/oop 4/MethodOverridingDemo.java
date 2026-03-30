// 3. Write a Java program to show method overriding.

class Parent {
    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class display method");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display();

        Parent ref = new Child(); // Polymorphism
        ref.display();
    }
}