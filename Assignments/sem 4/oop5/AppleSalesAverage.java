// 20. Write a program to accept value of apple sales for each day of the week (using array of type float) and then, calculate the average sale of the week.

import java.util.Scanner;

public class AppleSalesAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        float[] sales = new float[7];

        System.out.println("Enter apple sales for each day of the week:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Sales for " + days[i] + ": ");
            sales[i] = sc.nextFloat();
        }

        float totalSales = 0;
        for (float sale : sales) {
            totalSales += sale;
        }

        float averageSale = totalSales / 7;

        System.out.println("\n------- Sales Summary -------");
        for (int i = 0; i < 7; i++) {
            System.out.println(days[i] + ": " + sales[i]);
        }

        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Sale of the Week: " + averageSale);
    }
}