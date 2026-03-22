// 5. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override these two methods in each of the derived classes to calculate the volume and whole surface area of each type of three-dimensional objects. The dimensions of the objects are to be taken from the users and passed through the respective constructors of each derived class. Write a main method to test these classes.

import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    private double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    private double side;

    Cube(double s) {
        side = s;
    }

    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius, height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    double wholeSurfaceArea() {
        double slant = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slant);
    }

    double volume() {
        return (1.0/3) * Math.PI * radius * radius * height;
    }
}

public class ThreeDObjectDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for Box (length, width, height): ");
        Box box = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter side for Cube: ");
        Cube cube = new Cube(sc.nextDouble());

        System.out.println("Enter radius and height for Cylinder: ");
        Cylinder cyl = new Cylinder(sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter radius and height for Cone: ");
        Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());

        System.out.println("Box - Surface Area: " + box.wholeSurfaceArea() + ", Volume: " + box.volume());
        System.out.println("Cube - Surface Area: " + cube.wholeSurfaceArea() + ", Volume: " + cube.volume());
        System.out.println("Cylinder - Surface Area: " + cyl.wholeSurfaceArea() + ", Volume: " + cyl.volume());
        System.out.println("Cone - Surface Area: " + cone.wholeSurfaceArea() + ", Volume: " + cone.volume());
    }
}