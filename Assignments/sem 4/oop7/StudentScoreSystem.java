// 25. Write an application that displays a series of at least five student ID numbers and asks the user to enter a numeric test score for the student.

class ScoreException extends Exception {
    ScoreException(String message) {
        super(message);
    }
}

public class StudentScoreSystem {
    public static void main(String[] args) {
        String[] studentIds = {"S001", "S002", "S003", "S004", "S005"};
        int[] scores = new int[5];

        java.util.Scanner sc = new java.util.Scanner(System.in);

        for (int i = 0; i < studentIds.length; i++) {
            try {
                System.out.print("Enter score for student " + studentIds[i] + " (0-100): ");
                int score = sc.nextInt();

                validateScore(score);
                scores[i] = score;
                System.out.println("Score recorded: " + score);

            } catch (ScoreException e) {
                System.out.println("Exception: " + e.getMessage());
                scores[i] = 0; // Store 0 for invalid score
                System.out.println("Score set to 0");
            }
        }

        // Display all student IDs and scores
        System.out.println("\nFinal Results:");
        System.out.println("Student ID\tScore");
        System.out.println("----------\t-----");
        for (int i = 0; i < studentIds.length; i++) {
            System.out.println(studentIds[i] + "\t\t" + scores[i]);
        }

        sc.close();
    }

    static void validateScore(int score) throws ScoreException {
        if (score < 0 || score > 100) {
            throw new ScoreException("Score must be between 0 and 100. Invalid score: " + score);
        }
    }
}
