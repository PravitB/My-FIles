// 11. Write a java program to create an custom Exception that would handle at least 2 kind of Arithmetic Exceptions while calculating a given equation.

class ArithmeticExceptionHandler extends Exception {
    ArithmeticExceptionHandler(String message) {
        super(message);
    }
}

public class CustomArithmeticException {
    public static void main(String[] args) {
        try {
            // Equation: X+Y*(P/Q)*Z-I
            int X = 10, Y = 5, P = 8, Q = 0, Z = 3, I = 2;

            System.out.println("Calculating: " + X + "+" + Y + "*(" + P + "/" + Q + ")*" + Z + "-" + I);

            if (Q == 0) {
                throw new ArithmeticExceptionHandler("Division by zero error in P/Q");
            }

            double result = X + Y * (P / Q) * Z - I;
            System.out.println("Result: " + result);

        } catch (ArithmeticExceptionHandler e) {
            System.out.println("Custom Arithmetic Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Standard Arithmetic Exception: " + e.getMessage());
        }

        try {
            // Another calculation that might cause overflow
            int a = Integer.MAX_VALUE;
            int b = 2;
            int result = a * b; // This will cause overflow
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception (overflow): " + e.getMessage());
        }
    }
}
