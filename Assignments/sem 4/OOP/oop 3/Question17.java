/* 17. Write a Java program to merge two float arrays. */

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        float[] arr1 = new float[n1];
        System.out.println("Enter first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextFloat();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        float[] arr2 = new float[n2];
        System.out.println("Enter second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextFloat();
        }

        float[] merged = new float[n1 + n2];
        System.arraycopy(arr1, 0, merged, 0, n1);
        System.arraycopy(arr2, 0, merged, n1, n2);

        System.out.println("Merged array:");
        for (float num : merged) {
            System.out.print(num + " ");
        }
    }
}