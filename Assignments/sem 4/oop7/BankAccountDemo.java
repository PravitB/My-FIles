// 16. Write a Java Program to Create Account with 500 Rs Minimum Balance, Deposit Amount, Withdraw Amount and Also Throws LessBalanceException.

class LessBalanceException extends Exception {
    LessBalanceException(String message) {
        super(message);
    }
}

class Account {
    private String accountNumber;
    private double balance;

    Account(String accNum, double initialBalance) {
        accountNumber = accNum;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + balance);
    }

    void withdraw(double amount) throws LessBalanceException {
        if (balance - amount < 500) {
            throw new LessBalanceException("Withdraw amount (" + amount + " Rs) is not valid. Minimum balance of 500 Rs required.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
    }

    double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Account acc1 = new Account("ACC001", 1000);
        Account acc2 = new Account("ACC002", 1000);

        acc1.deposit(500);
        acc2.deposit(300);

        try {
            acc1.withdraw(200);
            acc2.withdraw(900); // This will throw exception
        } catch (LessBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
