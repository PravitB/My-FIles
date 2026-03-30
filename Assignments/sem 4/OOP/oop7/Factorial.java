// 5. Write a program called Factorial.java that computes factorials and catches the result in an array of type long for reuse.

class FactorialOverflowException extends Exception {
    FactorialOverflowException(String message) {
        super(message);
    }
}

public class Factorial {
    private static final int MAX_N = 20;
    private static long[] factorialCache = new long[MAX_N + 1];

    static {
        factorialCache[0] = 1;
        for (int i = 1; i <= MAX_N; i++) {
            factorialCache[i] = factorialCache[i - 1] * i;
        }
    }

    public static long computeFactorial(int x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("Value of x must be positive");
        }
        if (x > MAX_N) {
            throw new IllegalArgumentException("Result will overflow");
        }
        return factorialCache[x];
    }

    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5: " + computeFactorial(5));
            System.out.println("Factorial of 10: " + computeFactorial(10));
            System.out.println("Factorial of 25: " + computeFactorial(25)); // Will throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
