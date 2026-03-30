// 14. Create a base class called "vehicle" that stores number of wheels and speed. Create the following derived classes – "car" that inherits "vehicle" and also stores number of passengers. "truck" that inherits "vehicle" and also stores the load limit. Write a main function to create objects of these two derived classes and display all the information about "car" and "truck". Also compare the speed of these two vehicles - car and truck and display which one is faster.

class vehicle {
    protected int wheels;
    protected int speed;

    vehicle(int w, int s) {
        wheels = w;
        speed = s;
    }

    void display() {
        System.out.println("Wheels: " + wheels + ", Speed: " + speed + " mph");
    }
}

class car extends vehicle {
    private int passengers;

    car(int w, int s, int p) {
        super(w, s);
        passengers = p;
    }

    void display() {
        super.display();
        System.out.println("Passengers: " + passengers);
    }
}

class truck extends vehicle {
    private double loadLimit;

    truck(int w, int s, double ll) {
        super(w, s);
        loadLimit = ll;
    }

    void display() {
        super.display();
        System.out.println("Load Limit: " + loadLimit + " tons");
    }
}

public class VehicleCarTruckDemo {
    public static void main(String[] args) {
        car c = new car(4, 120, 5);
        truck t = new truck(6, 80, 10.5);

        System.out.println("Car:");
        c.display();

        System.out.println("\nTruck:");
        t.display();

        if (c.speed > t.speed) {
            System.out.println("\nCar is faster.");
        } else if (t.speed > c.speed) {
            System.out.println("\nTruck is faster.");
        } else {
            System.out.println("\nBoth have same speed.");
        }
    }
}