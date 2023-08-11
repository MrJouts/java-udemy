package dev.lpa;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        if (transaction <= 0) {
            System.out.println("Transaction amount must be a positive number");
            return;
        }
        transactions.add(transaction);
    }
}
