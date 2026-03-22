// 1. Write a Java program to show the use of all keywords for exception handling.

public class ExceptionKeywordsDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed again");
        }

        // Using throw keyword
        try {
            throw new NullPointerException("Manually thrown exception");
        } catch (NullPointerException e) {
            System.out.println("Caught manually thrown exception: " + e.getMessage());
        }

        // Using throws keyword in method signature
        try {
            methodThatThrows();
        } catch (Exception e) {
            System.out.println("Caught exception from method: " + e.getMessage());
        }
    }

    static void methodThatThrows() throws Exception {
        throw new Exception("Exception from method");
    }
}
