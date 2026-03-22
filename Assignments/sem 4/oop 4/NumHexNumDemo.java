// 10. Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. Now create a derived class HexNum which inherits Num and overrides shownum() which displays the hexadecimal value of the number. Demonstrate the working of the classes.

class Num {
    protected int number;

    Num(int n) {
        number = n;
    }

    void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    HexNum(int n) {
        super(n);
    }

    void shownum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
    }
}

public class NumHexNumDemo {
    public static void main(String[] args) {
        Num num = new Num(255);
        HexNum hex = new HexNum(255);

        num.shownum();
        hex.shownum();
    }
}