// 17. Java program to Perform Payroll Using Interface (Multiple Inheritance)

interface PayrollSystem {
    void calculateSalary();
    void generatePayslip();
}

class PayrollEmployee {
    protected String empName;
    protected String empId;
    protected double hourlyRate;
    protected double hoursWorked;

    PayrollEmployee(String name, String id, double rate, double hours) {
        empName = name;
        empId = id;
        hourlyRate = rate;
        hoursWorked = hours;
    }

    void displayEmployee() {
        System.out.println("Employee: " + empName + ", ID: " + empId);
    }
}

class Payroll extends PayrollEmployee implements PayrollSystem {
    private double grossSalary;
    private double tax;
    private double netSalary;

    Payroll(String name, String id, double rate, double hours) {
        super(name, id, rate, hours);
    }

    public void calculateSalary() {
        grossSalary = hourlyRate * hoursWorked;
        tax = (grossSalary * 10) / 100;
        netSalary = grossSalary - tax;
    }

    public void generatePayslip() {
        System.out.println("\n========== PAYSLIP ==========");
        displayEmployee();
        System.out.println("Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax (10%): " + tax);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("=============================\n");
    }
}

public class PayrollDemo {
    public static void main(String[] args) {
        Payroll employee1 = new Payroll("Charlie", "EMP101", 500, 40);
        employee1.calculateSalary();
        employee1.generatePayslip();

        Payroll employee2 = new Payroll("Diana", "EMP102", 600, 43);
        employee2.calculateSalary();
        employee2.generatePayslip();
    }
}
