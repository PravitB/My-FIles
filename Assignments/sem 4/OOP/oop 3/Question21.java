/* 21. Write a Java program to find duplicate elements in a 1D array and find their frequency of occurrence. */

import java.util.HashMap;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicates and frequencies:");
        for (int key : freq.keySet()) {
            if (freq.get(key) > 1) {
                System.out.println(key + " : " + freq.get(key));
            }
        }
    }
}