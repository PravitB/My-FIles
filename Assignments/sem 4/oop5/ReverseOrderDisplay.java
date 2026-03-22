// 17. Write a program that reads ten integers and displays them in the reverse of the order in which they were read.

import java.util.Scanner;

public class ReverseOrderDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNumbers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}