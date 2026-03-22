// 8. Create an abstract class Accounts with SavingsAccount subclass

abstract class Accounts {
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

    Accounts(String accNum, String name, String addr, double bal) {
        accountNumber = accNum;
        accountHoldersName = name;
        address = addr;
        balance = bal;
    }

    abstract void withdrawal(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    private double rateOfInterest;

    SavingsAccount(String accNum, String name, String addr, double bal, double roi) {
        super(accNum, name, addr, bal);
        rateOfInterest = roi;
    }

    void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful: " + amount);
    }

    void calculateAmount() {
        double interest = (balance * rateOfInterest) / 100;
        System.out.println("Interest calculated: " + interest);
        System.out.println("Total amount: " + (balance + interest));
    }

    void display() {
        super.display();
        System.out.println("Holder: " + accountHoldersName + ", Address: " + address);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}

public class AccountsDemo {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("SAV123", "John Doe", "123 Main St", 5000, 5);
        acc.display();

        acc.deposit(1000);
        acc.withdrawal(500);

        acc.calculateAmount();
    }
}
