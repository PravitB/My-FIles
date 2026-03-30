// 11. Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. Now create a derived class OctNum which inherits Num and overrides shownum() which displays the octal value of the number. Demonstrate the working of the classes.

class Num {
    protected int number;

    Num(int n) {
        number = n;
    }

    void shownum() {
        System.out.println("Number: " + number);
    }
}

class OctNum extends Num {
    OctNum(int n) {
        super(n);
    }

    void shownum() {
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class NumOctNumDemo {
    public static void main(String[] args) {
        Num num = new Num(255);
        OctNum oct = new OctNum(255);

        num.shownum();
        oct.shownum();
    }
}