// 12. Combine Question number 10 and 11 and have all the three classes together. Now describe the working of all classes.

class Num {
    protected int number;

    Num(int n) {
        number = n;
    }

    void shownum() {
        System.out.println("Decimal: " + number);
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

class OctNum extends Num {
    OctNum(int n) {
        super(n);
    }

    void shownum() {
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class NumHexOctDemo {
    public static void main(String[] args) {
        Num num = new Num(255);
        HexNum hex = new HexNum(255);
        OctNum oct = new OctNum(255);

        num.shownum();
        hex.shownum();
        oct.shownum();
    }
}