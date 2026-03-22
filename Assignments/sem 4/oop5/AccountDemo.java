// 13. Design a class named Account that contains: A private int data field named id for the account (default 0). A private double data field named balance for the account (default 0). A private double data field named annualInterestRate that stores the current interest rate (default 0). A private Date data field named dateCreated that stores the date when the account was created. A no-arg constructor that creates a default account. A constructor that creates an account with the specified id and initial balance. The accessor and mutator methods for id, balance, and annualInterestRate. The accessor method for dateCreated. A method named getMonthlyInterestRate() that returns the monthly interest rate. A method named getMonthlyInterest() that returns the monthly interest. A method named withdraw that withdraws a specified amount from the account. A method named deposit that deposits a specified amount to the account.

import java.util.Date;

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    Account() {
        dateCreated = new Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void display() {
        System.out.println("Account ID: " + id);
        System.out.println("Balance: " + balance);
        System.out.println("Annual Interest Rate: " + annualInterestRate);
        System.out.println("Monthly Interest Rate: " + getMonthlyInterestRate());
        System.out.println("Monthly Interest: " + getMonthlyInterest());
        System.out.println("Date Created: " + dateCreated);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account acc = new Account(1001, 5000);
        acc.setAnnualInterestRate(0.05);

        acc.deposit(1000);
        System.out.println("After deposit, balance: " + acc.getBalance());

        acc.withdraw(500);
        System.out.println("After withdrawal, balance: " + acc.getBalance());

        acc.display();
    }
}