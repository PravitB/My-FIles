// 1. Create a "circle" class & a "point" class. The coordinates of the circle are given and used within the "circle" class as object of the "point" class. Display the area of circle.

class Point {
    private double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
}

class Circle {
    private Point center;
    private double radius;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Center: (" + center.getX() + ", " + center.getY() + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }
}

public class CirclePoint {
    public static void main(String[] args) {
        Point p = new Point(5.0, 10.0);
        Circle c = new Circle(p, 7.5);
        c.display();
    }
}