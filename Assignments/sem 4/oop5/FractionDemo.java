// 7. Write a program to define a class Fraction having data members numerator and denominator. Initialize three objects using different constructors and display its fractional value.

class Fraction {
    private int numerator, denominator;

    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    Fraction(int num) {
        numerator = num;
        denominator = 1;
    }

    Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    void display() {
        System.out.println(numerator + "/" + denominator);
    }
}

public class FractionDemo {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction(7, 8);

        System.out.println("Fraction 1: ");
        f1.display();
        System.out.println("Fraction 2: ");
        f2.display();
        System.out.println("Fraction 3: ");
        f3.display();
    }
}