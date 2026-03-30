// 5. Create three interfaces, each with two methods. Inherit a new interface from the three, adding a new method.

interface Interface1 {
    void method1A();
    void method1B();
}

interface Interface2 {
    void method2A();
    void method2B();
}

interface Interface3 {
    void method3A();
    void method3B();
}

interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void methodCombined();
}

class ConcreteClass {
    void concreteMethod() {
        System.out.println("This is a concrete method");
    }
}

class ImplementingClass extends ConcreteClass implements CombinedInterface {
    public void method1A() {
        System.out.println("Method 1A implemented");
    }

    public void method1B() {
        System.out.println("Method 1B implemented");
    }

    public void method2A() {
        System.out.println("Method 2A implemented");
    }

    public void method2B() {
        System.out.println("Method 2B implemented");
    }

    public void method3A() {
        System.out.println("Method 3A implemented");
    }

    public void method3B() {
        System.out.println("Method 3B implemented");
    }

    public void methodCombined() {
        System.out.println("Combined method implemented");
    }
}

public class MultipleInterfaceDemo {
    static void acceptInterface1(Interface1 obj) {
        obj.method1A();
        obj.method1B();
    }

    static void acceptInterface2(Interface2 obj) {
        obj.method2A();
        obj.method2B();
    }

    static void acceptInterface3(Interface3 obj) {
        obj.method3A();
        obj.method3B();
    }

    static void acceptCombined(CombinedInterface obj) {
        obj.methodCombined();
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        acceptInterface1(obj);
        acceptInterface2(obj);
        acceptInterface3(obj);
        acceptCombined(obj);
    }
}