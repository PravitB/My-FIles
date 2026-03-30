/* 13. Write a Java program to check whether a given matrix is sparse or not. */

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements:");
        int zeroCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 0) zeroCount++;
            }
        }

        int total = rows * cols;
        if (zeroCount > total / 2) {
            System.out.println("Matrix is sparse");
        } else {
            System.out.println("Matrix is not sparse");
        }
    }
}