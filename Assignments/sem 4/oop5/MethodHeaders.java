// 15. Write method headers for the following methods: a. Computing a sales commission, given the sales amount and the commission rate. b. Printing the calendar for a month, given the month and year. c. Computing a square root. d. Testing whether a number is even, and returning true if it is. e. Printing a message a specified number of times. f. Computing the monthly payment, given the loan amount, number of years, and annual interest rate.

public class MethodHeaders {
    // a. Computing a sales commission, given the sales amount and the commission rate.
    public double computeSalesCommission(double salesAmount, double commissionRate) {
        return salesAmount * commissionRate;
    }

    // b. Printing the calendar for a month, given the month and year.
    public void printCalendar(int month, int year) {
        System.out.println("Calendar for month " + month + " of year " + year);
    }

    // c. Computing a square root.
    public double computeSquareRoot(double number) {
        return Math.sqrt(number);
    }

    // d. Testing whether a number is even, and returning true if it is.
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // e. Printing a message a specified number of times.
    public void printMessageMultipleTimes(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    // f. Computing the monthly payment, given the loan amount, number of years, and annual interest rate.
    public double computeMonthlyPayment(double loanAmount, int years, double annualRate) {
        double monthlyRate = annualRate / 12;
        int numberOfPayments = years * 12;
        return loanAmount * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
    }

    public static void main(String[] args) {
        MethodHeaders mh = new MethodHeaders();

        System.out.println("Sales Commission: " + mh.computeSalesCommission(10000, 0.05));
        System.out.println("Square Root of 16: " + mh.computeSquareRoot(16));
        System.out.println("Is 10 even? " + mh.isEven(10));
        System.out.println("Monthly Payment for 100000 loan for 5 years at 5% rate: " + mh.computeMonthlyPayment(100000, 5, 0.05));
        mh.printCalendar(3, 2026);
        mh.printMessageMultipleTimes("Hello", 3);
    }
}