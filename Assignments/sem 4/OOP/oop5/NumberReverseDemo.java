// 4. Write a program to define a class having one 3-digit number, num as data member. Initialize and display reverse of that number.

class NumberReverse {
    private int num;

    NumberReverse(int n) {
        num = n;
    }

    int reverseNumber() {
        int rev = 0;
        int temp = num;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return rev;
    }

    void display() {
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reverseNumber());
    }
}

public class NumberReverseDemo {
    public static void main(String[] args) {
        NumberReverse nr = new NumberReverse(345);
        nr.display();
    }
}