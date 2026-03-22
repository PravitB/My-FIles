// 19. Write a program to demonstrate use of 'static' keyword.

class Counter {
    private static int count = 0;
    private int id;

    Counter() {
        Counter.count++;
        this.id = Counter.count;
    }

    static int getCount() {
        return Counter.count;
    }

    void display() {
        System.out.println("Counter ID: " + this.id);
        System.out.println("Total Counters created: " + Counter.getCount());
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        System.out.println("Initial count: " + Counter.getCount());

        Counter c1 = new Counter();
        c1.display();

        Counter c2 = new Counter();
        c2.display();

        Counter c3 = new Counter();
        c3.display();

        System.out.println("\nTotal Counter objects created: " + Counter.getCount());
    }
}