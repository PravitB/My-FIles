// 15. Multiple Inheritance using Exam Interface with Student and Result classes

interface Exam {
    void conductExam();
    void announceResults();
}

class StudentInfo {
    protected String studentName;
    protected String rollNumber;

    StudentInfo(String name, String roll) {
        studentName = name;
        rollNumber = roll;
    }

    void displayStudent() {
        System.out.println("Student: " + studentName + ", Roll: " + rollNumber);
    }
}

class Result extends StudentInfo implements Exam {
    private int marksObtained;
    private int totalMarks;
    private String grade;

    Result(String name, String roll, int obtained, int total) {
        super(name, roll);
        marksObtained = obtained;
        totalMarks = total;
        calculateGrade();
    }

    private void calculateGrade() {
        double percentage = (marksObtained * 100.0) / totalMarks;
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else grade = "F";
    }

    public void conductExam() {
        System.out.println("Exam conducted for " + studentName);
    }

    public void announceResults() {
        System.out.println("Results announced - Marks: " + marksObtained + "/" + totalMarks + ", Grade: " + grade);
    }

    void displayResult() {
        displayStudent();
        System.out.println("Marks Obtained: " + marksObtained + " out of " + totalMarks);
        System.out.println("Grade: " + grade);
    }
}

public class ExamResultDemo {
    public static void main(String[] args) {
        Result result = new Result("Bob Smith", "ROLL1001", 85, 100);
        result.conductExam();
        result.displayResult();
        result.announceResults();
    }
}
