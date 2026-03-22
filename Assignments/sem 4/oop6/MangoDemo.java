// 14. Interface Mango implemented in Winter and Summer classes

interface Mango {
    void taste();
    void ripeness();
}

class WinterMango implements Mango {
    public void taste() {
        System.out.println("Winter Mango: Sour taste, not fully ripened");
    }

    public void ripeness() {
        System.out.println("Ripeness: 40% - Too early to consume");
    }

    void display() {
        System.out.println("--- Winter Mango ---");
        taste();
        ripeness();
    }
}

class SummerMango implements Mango {
    public void taste() {
        System.out.println("Summer Mango: Sweet and juicy taste");
    }

    public void ripeness() {
        System.out.println("Ripeness: 100% - Perfect to consume");
    }

    void display() {
        System.out.println("--- Summer Mango ---");
        taste();
        ripeness();
    }
}

public class MangoDemo {
    public static void main(String[] args) {
        WinterMango winterMango = new WinterMango();
        winterMango.display();

        System.out.println();

        SummerMango summerMango = new SummerMango();
        summerMango.display();
    }
}
