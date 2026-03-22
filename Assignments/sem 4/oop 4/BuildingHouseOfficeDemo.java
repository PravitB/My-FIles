// 9. In the earlier program, create a second derived class Office that inherits Building and stores the number of telephones and tables. Now demonstrate the working of all three classes.

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

class Office extends Building {
    private int telephones;
    private int tables;

    Office(int f, int r, double ft, int tel, int tab) {
        super(f, r, ft);
        telephones = tel;
        tables = tab;
    }

    void display() {
        super.display();
        System.out.println("Telephones: " + telephones + ", Tables: " + tables);
    }
}

public class BuildingHouseOfficeDemo {
    public static void main(String[] args) {
        Building building = new Building(3, 10, 2000.0);
        House house = new House(2, 8, 1500.0, 4, 3);
        Office office = new Office(5, 20, 5000.0, 15, 25);

        System.out.println("Building:");
        building.display();

        System.out.println("\nHouse:");
        house.display();

        System.out.println("\nOffice:");
        office.display();
    }
}