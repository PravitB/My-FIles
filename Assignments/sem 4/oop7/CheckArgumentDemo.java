// 9. Create a user-defined exception named CheckArgument to check the number of arguments passed through the command line.

class CheckArgument extends Exception {
    CheckArgument(String message) {
        super(message);
    }
}

public class CheckArgumentDemo {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgument("At least 5 arguments required, but only " + args.length + " provided");
            }

            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("Sum of all arguments: " + sum);
        } catch (CheckArgument e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception: All arguments must be integers");
        }
    }
}
