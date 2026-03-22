// 11. Define a class called circle that contains: Two private instance variables: radius (of type double) and color (of type String), Initialize the variables radius and color with default value of 1.0 and "red", respectively using default constructor. Include a second constructor that will use the default value for color and sets the radius to the value passed as parameter. Two public methods: getRadius() and getArea() for returning the radius and area of the circle. Invoke the above methods and constructors in the main.

class circle {
    private double radius;
    private String color;

    circle() {
        radius = 1.0;
        color = "red";
    }

    circle(double r) {
        radius = r;
        color = "red";
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Color: " + color);
        System.out.println("Area: " + getArea());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        circle c1 = new circle();
        circle c2 = new circle(5.0);

        System.out.println("Circle 1 (default constructor):");
        c1.display();

        System.out.println("\nCircle 2 (custom radius constructor):");
        c2.display();
    }
}