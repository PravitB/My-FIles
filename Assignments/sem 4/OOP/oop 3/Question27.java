/* 27. Write a class, Grader, which has an instance variable, score, an appropriate constructor and appropriate methods. A method, letterGrade() that returns the letter grade as O/E/A/B/C/F. Now write a demo class to test the Grader class by reading a score from the user, using it to create a Grader object after validating that the value is not negative and is not greater then 100. Finally, call the letterGrade() method to get and print the grade. */

import java.util.Scanner;

class Grader {
    private double score;

    public Grader(double score) {
        this.score = score;
    }

    public String letterGrade() {
        if (score >= 90) return "O";
        else if (score >= 80) return "E";
        else if (score >= 70) return "A";
        else if (score >= 60) return "B";
        else if (score >= 50) return "C";
        else return "F";
    }
}

public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        double score = sc.nextDouble();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }

        Grader grader = new Grader(score);
        System.out.println("Grade: " + grader.letterGrade());
    }
}