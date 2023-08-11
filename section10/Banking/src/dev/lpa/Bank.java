package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch != null) return false;

        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (initialTransaction <= 0) return false;

        Branch branch = findBranch(branchName);
        if (branch == null) return false;

        for (var customer : branch.getCustomers()) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return false;
            }
        }

        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (transaction <= 0) return false;

        Branch branch = findBranch(branchName);
        if (branch == null) return false;

        for (var customer : branch.getCustomers()) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                customer.addTransaction(transaction);
                return true;
            }
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        for (var branch : branches) {
            if (branch.getName().equalsIgnoreCase(branchName))
                return branch;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;

        System.out.println("Customer details for branch " + branch.getName());

        int index = 1;
        for (Customer customer : branch.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + "[" + index + "]");
            index++;
            if (printTransactions) {
                System.out.println("Transactions");
                int indexTransactions = 1;
                for (double transaction : customer.getTransactions()) {
                    System.out.println("[" + indexTransactions + "] " + " Amount " + transaction);
                    indexTransactions++;
                }
            }
        }
        return true;
    }
}
