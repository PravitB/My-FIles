// 18. Consider a Quiz Management System, where a user needs to answer 5 questions.

class NotCorrectException extends Exception {
    NotCorrectException(String message) {
        super(message);
    }
}

public class QuizSystem {
    private static String[] questions = {
        "What is the capital of India?",
        "What is 2 + 2?",
        "What is the color of the sky?",
        "How many continents are there?",
        "What is the largest planet?"
    };

    private static String[] answers = {"Delhi", "4", "Blue", "7", "Jupiter"};

    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Please provide answers for all 5 questions");
            return;
        }

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Question " + (i+1) + ": " + questions[i]);
                checkAnswer(i, args[i]);
                System.out.println("Good! The answer is correct");
            }
            System.out.println("Quiz completed successfully!");

        } catch (NotCorrectException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void checkAnswer(int questionIndex, String userAnswer) throws NotCorrectException {
        if (!answers[questionIndex].equalsIgnoreCase(userAnswer)) {
            throw new NotCorrectException("Wrong answer for question " + (questionIndex+1) + ". Correct answer: " + answers[questionIndex]);
        }
    }
}
