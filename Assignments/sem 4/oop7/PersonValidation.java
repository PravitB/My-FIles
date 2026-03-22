// 21. Write a program to input name and age of a person and throw a user-defined exception, if the entered age is negative.

class NegativeAgeException extends Exception {
    NegativeAgeException(String message) {
        super(message);
    }
}

public class PersonValidation {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            validatePerson(name, age);
            System.out.println("Person validated: " + name + ", Age: " + age);

        } catch (NegativeAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Exception: Age must be a valid integer");
        } finally {
            sc.close();
        }
    }

    static void validatePerson(String name, int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative: " + age);
        }
    }
}
