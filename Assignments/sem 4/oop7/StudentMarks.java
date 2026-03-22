// 10. Consider a Student examination database system that prints the mark sheet of students.

class RangeException extends Exception {
    RangeException(String message) {
        super(message);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        if (args.length < 7) {
            System.out.println("Usage: java StudentMarks <name> <mark1> <mark2> <mark3> <mark4> <mark5> <mark6>");
            return;
        }

        try {
            String name = args[0];
            int[] marks = new int[6];
            int total = 0;

            for (int i = 1; i <= 6; i++) {
                marks[i-1] = Integer.parseInt(args[i]);
                if (marks[i-1] < 0 || marks[i-1] > 50) {
                    throw new RangeException("Marks must be between 0 and 50. Invalid mark: " + marks[i-1]);
                }
                total += marks[i-1];
            }

            double percentage = (total / 300.0) * 100;
            System.out.println("Student Name: " + name);
            System.out.println("Total Marks: " + total + "/300");
            System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");

        } catch (RangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception: All marks must be valid integers");
        }
    }
}
