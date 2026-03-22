// 9. Create an abstract class MotorVehicle with Car subclass

abstract class MotorVehicle {
    protected String modelName;
    protected String modelNumber;
    protected double modelPrice;

    MotorVehicle(String name, String number, double price) {
        modelName = name;
        modelNumber = number;
        modelPrice = price;
    }

    void display() {
        System.out.println("Model: " + modelName + ", Number: " + modelNumber + ", Price: " + modelPrice);
    }
}

class Car extends MotorVehicle {
    private double discountRate;

    Car(String name, String number, double price, double discount) {
        super(name, number, price);
        discountRate = discount;
    }

    void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate + "%");
    }

    void discount() {
        double discountAmount = (modelPrice * discountRate) / 100;
        double finalPrice = modelPrice - discountAmount;
        System.out.println("Original Price: " + modelPrice);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price after discount: " + finalPrice);
    }
}

public class MotorVehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", "TOY2024", 250000, 10);
        car.display();
        car.discount();
    }
}
