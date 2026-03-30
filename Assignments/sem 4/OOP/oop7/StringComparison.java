// 23. Write a program to throw a user-defined exception "String Mismatch Exception", if two strings are not equal (ignore the case).

class StringMismatchException extends Exception {
    StringMismatchException(String message) {
        super(message);
    }
}

public class StringComparison {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two strings to compare");
            return;
        }

        try {
            String str1 = args[0];
            String str2 = args[1];

            compareStrings(str1, str2);
            System.out.println("Strings match (case insensitive): '" + str1 + "' and '" + str2 + "'");

        } catch (StringMismatchException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void compareStrings(String str1, String str2) throws StringMismatchException {
        if (!str1.equalsIgnoreCase(str2)) {
            throw new StringMismatchException("String Mismatch Exception: '" + str1 + "' does not match '" + str2 + "' (case insensitive)");
        }
    }
}
