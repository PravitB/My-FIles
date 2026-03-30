/* 18. Write a Java program where elements of two integer arrays get added index wise and get stored into a third array. */

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] sum = new int[n];

        System.out.println("Enter first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum array:");
        for (int num : sum) {
            System.out.print(num + " ");
        }
    }
}