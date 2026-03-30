// 2. Create a class called Time, which has three private instance variables – hour, min and sec. It contains a method called add( ) which takes one Time object as parameter and print the added value of the calling Time object and passes Time object.

class Time {
    private int hour, min, sec;

    Time(int h, int m, int s) {
        hour = h;
        min = m;
        sec = s;
    }

    void add(Time t) {
        int totalSec = this.sec + t.sec;
        int totalMin = this.min + t.min + totalSec / 60;
        int totalHour = this.hour + t.hour + totalMin / 60;

        totalSec = totalSec % 60;
        totalMin = totalMin % 60;

        System.out.println("Added Time: " + totalHour + " hours, " + totalMin + " minutes, " + totalSec + " seconds");
    }

    void display() {
        System.out.println(hour + ":" + min + ":" + sec);
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(2, 30, 45);
        Time t2 = new Time(1, 45, 30);

        System.out.println("Time 1: ");
        t1.display();
        System.out.println("Time 2: ");
        t2.display();
        System.out.println("Adding Time 1 and Time 2:");
        t1.add(t2);
    }
}