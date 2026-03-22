// 4. Write a program to create a class named Vehicle having protected instance variables regnNumber, speed, color, ownerName and a method showData ( ) to show "This is a vehicle class".

class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    Vehicle(String regn, int spd, String col, String owner) {
        regnNumber = regn;
        speed = spd;
        color = col;
        ownerName = owner;
    }

    void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    Bus(String regn, int spd, String col, String owner, int route) {
        super(regn, spd, col, owner);
        routeNumber = route;
    }

    void showData() {
        super.showData();
        System.out.println("Bus - Regn: " + regnNumber + ", Speed: " + speed + ", Color: " + color);
        System.out.println("Owner: " + ownerName + ", Route: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    Car(String regn, int spd, String col, String owner, String manu) {
        super(regn, spd, col, owner);
        manufacturerName = manu;
    }

    void showData() {
        super.showData();
        System.out.println("Car - Regn: " + regnNumber + ", Speed: " + speed + ", Color: " + color);
        System.out.println("Owner: " + ownerName + ", Manufacturer: " + manufacturerName);
    }
}

public class VehicleInheritanceDemo {
    public static void main(String[] args) {
        Bus bus = new Bus("BUS123", 60, "Blue", "John", 101);
        bus.showData();

        System.out.println();

        Car car = new Car("CAR456", 120, "Red", "Jane", "Toyota");
        car.showData();
    }
}