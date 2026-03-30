// 13. Create a base class Distance which stores the distance between two locations in miles and a method travelTime(). The method prints the time taken to cover the distance when the speed is 60 miles per hour. Now in a derived class DistanceMKS, override travelTime() so that it prints the time assuming the distance is in kilometers and the speed is 100 km per second. Demonstrate the working of the classes.

class Distance {
    protected double distance; // in miles

    Distance(double d) {
        distance = d;
    }

    void travelTime() {
        double time = distance / 60; // hours
        System.out.println("Time at 60 mph: " + time + " hours");
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double d) {
        super(d); // d in kilometers
    }

    void travelTime() {
        double time = distance / 100; // seconds, since 100 km/s
        System.out.println("Time at 100 km/s: " + time + " seconds");
    }
}

public class DistanceDemo {
    public static void main(String[] args) {
        Distance dist = new Distance(120); // 120 miles
        DistanceMKS distMKS = new DistanceMKS(120); // 120 km

        dist.travelTime();
        distMKS.travelTime();
    }
}