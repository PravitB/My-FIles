// 13. Consider an Employee recruitment system that prints the candidate name based on the age criteria.

class TooOlder extends Exception {
    TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    TooYounger(String message) {
        super(message);
    }
}

public class EmployeeRecruitment {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java EmployeeRecruitment <name> <age>");
            return;
        }

        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);

            checkEligibility(name, age);

        } catch (TooOlder | TooYounger e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception: Age must be a valid integer");
        }
    }

    static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate " + name + " is too old (age: " + age + ")");
        } else if (age < 20) {
            throw new TooYounger("Candidate " + name + " is too young (age: " + age + ")");
        } else {
            System.out.println("Candidate " + name + " is eligible (age: " + age + ")");
        }
    }
}
