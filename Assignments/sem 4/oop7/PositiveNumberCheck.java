// 22. Write a program to throw user defined exception if the given number is not positive.

class NotPositiveException extends Exception {
    NotPositiveException(String message) {
        super(message);
    }
}

public class PositiveNumberCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            checkPositive(number);
            System.out.println(number + " is a positive number");

        } catch (NotPositiveException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception: Please provide a valid integer");
        }
    }

    static void checkPositive(int number) throws NotPositiveException {
        if (number <= 0) {
            throw new NotPositiveException("Number is not positive: " + number);
        }
    }
}
