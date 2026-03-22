// 19. Write a program to raise a user defined exception if username is less than 6 characters and password does not match.

class InvalidCredentialsException extends Exception {
    InvalidCredentialsException(String message) {
        super(message);
    }
}

public class AuthenticationDemo {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            System.out.print("Confirm password: ");
            String confirmPassword = sc.nextLine();

            validateCredentials(username, password, confirmPassword);
            System.out.println("Authentication successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    static void validateCredentials(String username, String password, String confirmPassword) throws InvalidCredentialsException {
        if (username.length() < 6) {
            throw new InvalidCredentialsException("Username must be at least 6 characters long");
        }
        if (!password.equals(confirmPassword)) {
            throw new InvalidCredentialsException("Passwords do not match");
        }
    }
}
