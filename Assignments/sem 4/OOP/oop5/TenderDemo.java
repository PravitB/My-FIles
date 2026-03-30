// 9. Write a program to define a class Tender containing data members cost and company name. Accept data for five objects and display company name for which cost is minimum.

import java.util.Scanner;

class Tender {
    private double cost;
    private String companyName;

    Tender(String name, double cost) {
        companyName = name;
        this.cost = cost;
    }

    double getCost() {
        return cost;
    }

    String getCompanyName() {
        return companyName;
    }
}

public class TenderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] tenders = new Tender[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Company Name " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter Cost: ");
            double cost = sc.nextDouble();
            sc.nextLine();
            tenders[i] = new Tender(name, cost);
        }

        double minCost = tenders[0].getCost();
        String minCompany = tenders[0].getCompanyName();

        for (int i = 1; i < 5; i++) {
            if (tenders[i].getCost() < minCost) {
                minCost = tenders[i].getCost();
                minCompany = tenders[i].getCompanyName();
            }
        }

        System.out.println("\nMinimum cost is for company: " + minCompany + " with cost: " + minCost);
    }
}