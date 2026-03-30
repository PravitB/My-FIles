// 19. Transportation Management System - Comprehensive Interface and Inheritance

interface Taxable {
    double calculateTax();
    void displayTaxInfo();
}

interface Insurable {
    double calculateInsurance();
    void displayInsuranceInfo();
}

abstract class Vehicle2 {
    protected String vehicleType;
    protected String registrationNumber;
    protected double purchasePrice;

    Vehicle2(String type, String regNum, double price) {
        vehicleType = type;
        registrationNumber = regNum;
        purchasePrice = price;
    }

    abstract void displayVehicleInfo();
}

class PersonalCar extends Vehicle2 implements Taxable, Insurable {
    private String fuelType;
    private int seatingCapacity;

    PersonalCar(String regNum, double price, String fuel, int seats) {
        super("Personal Car", regNum, price);
        fuelType = fuel;
        seatingCapacity = seats;
    }

    public double calculateTax() {
        return purchasePrice * 0.15;
    }

    public void displayTaxInfo() {
        System.out.println("Tax for " + registrationNumber + ": " + calculateTax());
    }

    public double calculateInsurance() {
        return purchasePrice * 0.05;
    }

    public void displayInsuranceInfo() {
        System.out.println("Insurance for " + registrationNumber + ": " + calculateInsurance());
    }

    void displayVehicleInfo() {
        System.out.println("Personal Car - Reg: " + registrationNumber + ", Price: " + purchasePrice + ", Fuel: " + fuelType + ", Seats: " + seatingCapacity);
    }
}

class CommercialTruck extends Vehicle2 implements Taxable, Insurable {
    private double carryingCapacity;
    private String truckType;

    CommercialTruck(String regNum, double price, double capacity, String type) {
        super("Commercial Truck", regNum, price);
        carryingCapacity = capacity;
        truckType = type;
    }

    public double calculateTax() {
        return purchasePrice * 0.20;
    }

    public void displayTaxInfo() {
        System.out.println("Tax for " + registrationNumber + ": " + calculateTax());
    }

    public double calculateInsurance() {
        return purchasePrice * 0.08;
    }

    public void displayInsuranceInfo() {
        System.out.println("Insurance for " + registrationNumber + ": " + calculateInsurance());
    }

    void displayVehicleInfo() {
        System.out.println("Commercial Truck - Reg: " + registrationNumber + ", Price: " + purchasePrice + ", Capacity: " + carryingCapacity + "kg, Type: " + truckType);
    }
}

public class TransportationDemo {
    public static void main(String[] args) {
        PersonalCar car = new PersonalCar("CAR001", 800000, "Diesel", 5);
        CommercialTruck truck = new CommercialTruck("TRUCK001", 2000000, 5000, "Box Truck");

        System.out.println("=== Vehicle Information ===");
        car.displayVehicleInfo();
        truck.displayVehicleInfo();

        System.out.println("\n=== Tax Information ===");
        car.displayTaxInfo();
        truck.displayTaxInfo();

        System.out.println("\n=== Insurance Information ===");
        car.displayInsuranceInfo();
        truck.displayInsuranceInfo();
    }
}
