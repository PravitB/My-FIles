// 15. Write a Java Program that Implement the Nested Try Statements.

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");

            try {
                System.out.println("Inner try block 1");
                int[] arr = new int[5];
                arr[10] = 100; // ArrayIndexOutOfBoundsException

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch 1: " + e.getMessage());

                try {
                    System.out.println("Inner try block 2");
                    String str = null;
                    str.length(); // NullPointerException

                } catch (NullPointerException e2) {
                    System.out.println("Inner catch 2: " + e2.getMessage());
                }
            }

            try {
                System.out.println("Inner try block 3");
                int result = 10 / 0; // ArithmeticException

            } catch (ArithmeticException e) {
                System.out.println("Inner catch 3: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        } finally {
            System.out.println("Outer finally block");
        }
    }
}
