// 20. Write a program to accept a password from the user and throw 'Authentication Failure' exception if the password is incorrect.

class AuthenticationFailure extends Exception {
    AuthenticationFailure(String message) {
        super(message);
    }
}

public class PasswordAuthentication {
    private static final String CORRECT_PASSWORD = "password123";

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            authenticate(password);
            System.out.println("Authentication successful!");

        } catch (AuthenticationFailure e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    static void authenticate(String password) throws AuthenticationFailure {
        if (!CORRECT_PASSWORD.equals(password)) {
            throw new AuthenticationFailure("Authentication Failure: Incorrect password");
        }
    }
}
