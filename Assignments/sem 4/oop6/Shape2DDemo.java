// 16. Hierarchical Inheritance using Interface

interface Shape2D {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape2D {
    private double radius;

    Circle(double r) {
        radius = r;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Circle: Radius = " + radius + ", Area = " + calculateArea() + ", Perimeter = " + calculatePerimeter());
    }
}

class Square implements Shape2D {
    private double side;

    Square(double s) {
        side = s;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    void display() {
        System.out.println("Square: Side = " + side + ", Area = " + calculateArea() + ", Perimeter = " + calculatePerimeter());
    }
}

class Ellipse implements Shape2D {
    private double a, b;

    Ellipse(double ma, double mb) {
        a = ma;
        b = mb;
    }

    public double calculateArea() {
        return Math.PI * a * b;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
    }

    void display() {
        System.out.println("Ellipse: A = " + a + ", B = " + b + ", Area = " + calculateArea() + ", Perimeter = " + calculatePerimeter());
    }
}

public class Shape2DDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display();

        Square square = new Square(4);
        square.display();

        Ellipse ellipse = new Ellipse(6, 4);
        ellipse.display();
    }
}
