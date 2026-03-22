// 8. Write a program that takes a value at the command line for which factorial is to be computed.

public class FactorialCommandLine {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("No arguments provided");
            }

            int x = Integer.parseInt(args[0]);

            if (x == 0) {
                throw new IllegalArgumentException("Zero is not allowed");
            }

            long result = computeFactorial(x);
            System.out.println("Factorial of " + x + " is " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: No argument provided. Please provide a number.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please provide an integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static long computeFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
