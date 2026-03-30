/* 23. Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write a Java program to merge them into single sorted array C that contains every item from arrays A & B, in ascending order. */

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] A = new int[n1];
        System.out.println("Enter first sorted array:");
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] B = new int[n2];
        System.out.println("Enter second sorted array:");
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        int[] C = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < n1) {
            C[k++] = A[i++];
        }
        while (j < n2) {
            C[k++] = B[j++];
        }

        System.out.println("Merged sorted array:");
        for (int num : C) {
            System.out.print(num + " ");
        }
    }
}