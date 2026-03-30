// 6. Write a program to create a class named Vehicle having protected instance variables regnNumber, speed, color, ownerName and a method showData ( ) to show "This is a vehicle class". Inherit the Vehicle class into subclasses named Bus and Car having individual private instance variables routeNumber in Bus and manufacturerName in Car and both of them having showData ( ) method showing all details of Bus and Car respectively with content of the super class's showData ( ) method.

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
        System.out.println("Bus Details: Regn: " + regnNumber + ", Speed: " + speed + ", Color: " + color + ", Owner: " + ownerName + ", Route: " + routeNumber);
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
        System.out.println("Car Details: Regn: " + regnNumber + ", Speed: " + speed + ", Color: " + color + ", Owner: " + ownerName + ", Manufacturer: " + manufacturerName);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus = new Bus("BUS123", 60, "Blue", "John", 101);
        Car car = new Car("CAR456", 120, "Red", "Jane", "Toyota");

        bus.showData();
        car.showData();
    }
}