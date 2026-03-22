// 16. Write a program that reads ten numbers, computes their average, and finds out how many numbers are above the average. [Use this keyword]

import java.util.Scanner;

class AverageChecker {
    private int[] numbers;
    private int count = 0;

    AverageChecker() {
        this.numbers = new int[10];
    }

    void readNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            this.numbers[i] = sc.nextInt();
        }
    }

    double getAverage() {
        double sum = 0;
        for (int num : this.numbers) {
            sum += num;
        }
        return sum / this.numbers.length;
    }

    int countAboveAverage() {
        double avg = this.getAverage();
        this.count = 0;
        for (int num : this.numbers) {
            if (num > avg) {
                this.count++;
            }
        }
        return this.count;
    }

    void display() {
        System.out.println("Average: " + this.getAverage());
        System.out.println("Count of numbers above average: " + this.countAboveAverage());
    }
}

public class AverageCheckerDemo {
    public static void main(String[] args) {
        AverageChecker ac = new AverageChecker();
        ac.readNumbers();
        ac.display();
    }
}