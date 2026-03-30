// 18. Write a program to demonstrate use of 'this' keyword.

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    Person getThis() {
        return this;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    void printDetails() {
        System.out.println(this);
        this.display();
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Jane", 30);

        System.out.println("Person 1:");
        p1.display();

        System.out.println("\nPerson 2:");
        p2.display();

        System.out.println("\nUsing getThis() and this reference:");
        Person pRef = p1.getThis();
        pRef.display();

        System.out.println("\nModifying person 1 using setters:");
        p1.setName("John Doe");
        p1.setAge(26);
        p1.display();
    }
}