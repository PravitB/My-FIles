/* 16. Write a Java program which counts the non-zero elements in an integer array. */

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int num : arr) {
            if (num != 0) count++;
        }
        System.out.println("Number of non-zero elements: " + count);
    }
}