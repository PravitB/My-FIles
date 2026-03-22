// 13. Multiple Inheritance using Gross Interface with Employee and Salary classes

interface Gross {
    double calculateGrossSalary();
    void displayGrossSalary();
}

class Employee {
    protected String empName;
    protected String empId;
    protected double basic;

    Employee(String name, String id, double bas) {
        empName = name;
        empId = id;
        basic = bas;
    }

    void displayEmployee() {
        System.out.println("Employee: " + empName + ", ID: " + empId + ", Basic: " + basic);
    }
}

class Salary extends Employee implements Gross {
    private double da;
    private double hra;
    private double ta;

    Salary(String name, String id, double bas, double d, double h, double t) {
        super(name, id, bas);
        da = d;
        hra = h;
        ta = t;
    }

    public double calculateGrossSalary() {
        return basic + da + hra + ta;
    }

    public void displayGrossSalary() {
        double gross = calculateGrossSalary();
        System.out.println("Gross Salary: " + gross);
    }

    void displaySalaryDetails() {
        displayEmployee();
        System.out.println("DA: " + da + ", HRA: " + hra + ", TA: " + ta);
        displayGrossSalary();
    }
}

public class GrossSalaryDemo {
    public static void main(String[] args) {
        Salary emp = new Salary("Alice", "EMP001", 30000, 5000, 8000, 2000);
        emp.displaySalaryDetails();
    }
}
