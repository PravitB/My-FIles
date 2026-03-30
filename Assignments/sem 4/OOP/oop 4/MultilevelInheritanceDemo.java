// 15. Write a Java program to explain "multilevel inheritance."

class A {
    void methodA() {
        System.out.println("Method from class A");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Method from class B");
    }
}

class C extends B {
    void methodC() {
        System.out.println("Method from class C");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA(); // From A
        obj.methodB(); // From B
        obj.methodC(); // From C
    }
}