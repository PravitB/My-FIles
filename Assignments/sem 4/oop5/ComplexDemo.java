// 3. Create a class called Complex, which has three private instance variables –real and imaginary. It contains a method called add( ) which takes one Complex object as parameter and print the added value of the calling Complex object and passes Complex object.

class Complex {
    private double real, imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void add(Complex c) {
        double sumReal = this.real + c.real;
        double sumImaginary = this.imaginary + c.imaginary;

        System.out.println("Sum: " + sumReal + " + " + sumImaginary + "i");
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(5.5, 3.2);
        Complex c2 = new Complex(2.3, 4.1);

        System.out.println("Complex 1: ");
        c1.display();
        System.out.println("Complex 2: ");
        c2.display();
        System.out.println("Adding Complex 1 and Complex 2:");
        c1.add(c2);
    }
}