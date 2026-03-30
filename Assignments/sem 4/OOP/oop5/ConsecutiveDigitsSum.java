// 21. Write program, which finds the sum of numbers formed by consecutive digits. Input : 2415, output : 24+41+15=80

import java.util.Scanner;

public class ConsecutiveDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        int sum = 0;
        String expression = "";

        for (int i = 0; i < number.length() - 1; i++) {
            String twoDigit = number.substring(i, i + 2);
            int value = Integer.parseInt(twoDigit);
            sum += value;

            if (i == 0) {
                expression += twoDigit;
            } else {
                expression += "+" + twoDigit;
            }
        }

        System.out.println("Output: " + expression + "=" + sum);
    }
}