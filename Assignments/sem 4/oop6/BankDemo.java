// 12. Bank interface with Account classes demonstrating multiple inheritance

interface Bank {
    void openAccount();
    void closeAccount();
}

class Customer {
    protected String customerName;
    protected String customerId;

    Customer(String name, String id) {
        customerName = name;
        customerId = id;
    }

    void displayCustomer() {
        System.out.println("Customer: " + customerName + ", ID: " + customerId);
    }
}

class Account extends Customer implements Bank {
    protected String accountNumber;
    protected double balance;

    Account(String name, String id, String accNum, double bal) {
        super(name, id);
        accountNumber = accNum;
        balance = bal;
    }

    public void openAccount() {
        System.out.println("Account " + accountNumber + " opened for " + customerName);
    }

    public void closeAccount() {
        System.out.println("Account " + accountNumber + " closed");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayAccount() {
        displayCustomer();
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account acc = new Account("John Doe", "CUST001", "ACC123456", 10000);
        acc.openAccount();
        acc.displayAccount();

        acc.deposit(5000);
        acc.withdraw(2000);

        acc.displayAccount();
        acc.closeAccount();
    }
}
