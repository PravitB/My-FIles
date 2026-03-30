/* 19. Write a Java program to multiply two matrices. */

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows for first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns for first matrix: ");
        int c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter rows for second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns for second matrix: ");
        int c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Cannot multiply");
            return;
        }
        int[][] mat2 = new int[r2][c2];
        System.out.println("Enter second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Product matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}