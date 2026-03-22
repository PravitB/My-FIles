// 3. Define an exception called "NoMatchFoundException" that is thrown when a string is not equal to "University".

class NoMatchFoundException extends Exception {
    NoMatchFoundException(String message) {
        super(message);
    }
}

public class NoMatchExceptionDemo {
    public static void main(String[] args) {
        try {
            checkString("College");
        } catch (NoMatchFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            checkString("University");
            System.out.println("String matches!");
        } catch (NoMatchFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void checkString(String str) throws NoMatchFoundException {
        if (!str.equals("University")) {
            throw new NoMatchFoundException("String does not match 'University'");
        }
    }
}
