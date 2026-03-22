// 8. Create a base class Building that stores the number of floors of a building, number of rooms and it's total footage. Create a derived class House that inherits Building and also stores the number of bedrooms and bathrooms. Demonstrate the working of the classes.

class Building {
    private int floors;
    private int rooms;
    private double footage;

    Building(int f, int r, double ft) {
        floors = f;
        rooms = r;
        footage = ft;
    }

    void display() {
        System.out.println("Floors: " + floors + ", Rooms: " + rooms + ", Footage: " + footage);
    }
}

class House extends Building {
    private int bedrooms;
    private int bathrooms;

    House(int f, int r, double ft, int bed, int bath) {
        super(f, r, ft);
        bedrooms = bed;
        bathrooms = bath;
    }

    void display() {
        super.display();
        System.out.println("Bedrooms: " + bedrooms + ", Bathrooms: " + bathrooms);
    }
}

public class BuildingHouseDemo {
    public static void main(String[] args) {
        Building building = new Building(3, 10, 2000.0);
        House house = new House(2, 8, 1500.0, 4, 3);

        System.out.println("Building:");
        building.display();

        System.out.println("\nHouse:");
        house.display();
    }
}