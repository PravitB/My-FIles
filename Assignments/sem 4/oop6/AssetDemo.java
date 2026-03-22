// 10. Asset class hierarchy with Stock, Bond, and Savings classes

abstract class Asset {
    protected String assetName;
    protected double value;

    Asset(String name, double val) {
        assetName = name;
        value = val;
    }

    abstract void displayDetails();
}

class Stock extends Asset {
    private String stockSymbol;

    Stock(String name, double val, String symbol) {
        super(name, val);
        stockSymbol = symbol;
    }

    void displayDetails() {
        System.out.println("Stock: " + assetName + " (Symbol: " + stockSymbol + "), Value: " + value);
    }
}

class Bond extends Asset {
    private double interestRate;

    Bond(String name, double val, double rate) {
        super(name, val);
        interestRate = rate;
    }

    void displayDetails() {
        System.out.println("Bond: " + assetName + ", Value: " + value + ", Interest Rate: " + interestRate + "%");
    }
}

class Savings extends Asset {
    private String bankName;

    Savings(String name, double val, String bank) {
        super(name, val);
        bankName = bank;
    }

    void displayDetails() {
        System.out.println("Savings: " + assetName + " at " + bankName + ", Value: " + value);
    }
}

public class AssetDemo {
    public static void main(String[] args) {
        Asset stock = new Stock("Apple Inc", 15000, "AAPL");
        Asset bond = new Bond("Government Bond", 50000, 5.5);
        Asset savings = new Savings("Fixed Deposit", 100000, "HDFC Bank");

        stock.displayDetails();
        bond.displayDetails();
        savings.displayDetails();
    }
}
