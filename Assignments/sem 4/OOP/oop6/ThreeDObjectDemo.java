// 3. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it.

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

    void display() {
        System.out.println("Box: L=" + length + ", W=" + width + ", H=" + height);
        System.out.println("Surface Area: " + wholeSurfaceArea() + ", Volume: " + volume());
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

    void display() {
        System.out.println("Cube: Side=" + side);
        System.out.println("Surface Area: " + wholeSurfaceArea() + ", Volume: " + volume());
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

    void display() {
        System.out.println("Cylinder: R=" + radius + ", H=" + height);
        System.out.println("Surface Area: " + wholeSurfaceArea() + ", Volume: " + volume());
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
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }

    void display() {
        System.out.println("Cone: R=" + radius + ", H=" + height);
        System.out.println("Surface Area: " + wholeSurfaceArea() + ", Volume: " + volume());
    }
}

public class ThreeDObjectDemo {
    public static void main(String[] args) {
        Box box = new Box(2, 3, 4);
        box.display();

        Cube cube = new Cube(5);
        cube.display();

        Cylinder cyl = new Cylinder(2, 3);
        cyl.display();

        Cone cone = new Cone(2, 4);
        cone.display();
    }
}