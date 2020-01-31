package com.company;

import java.text.BreakIterator;
import java.util.ArrayList;

public class Bank1 {
    private String name;
    private ArrayList<Branch1> branch1;

    public Bank1(String name) {
        this.name = name;
        this.branch1 = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
    public boolean addNewBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branch1.add(new Branch1(branchName));
            return true;
        }
        return false;
    }
    
    public boolean addNewCustomerToBranch(String branchName, String customerName, double initialAmount) {
        Branch1 branch1 = findBranch(branchName);
        if(branch1 != null) {
            return branch1.addNewCustomer(customerName, initialAmount);
        }
        return false;
    }
    
    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch1 branch1 = findBranch(branchName);
        if(branch1 != null) {
            return branch1.addTransactionToCustomer(customerName, amount);
        }
        return false;
    }

    public Branch1 findBranch(String name) {
        for(int i = 0; i < branch1.size(); i++) {
            Branch1 checkBranch = branch1.get(i);
            if(checkBranch.getName().equals(name)) {
                return checkBranch;
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean showTransaction) {
        Branch1 branch1 = findBranch(branchName);
        if(branch1 != null) {
            System.out.println("Show detail customer list for branch " + branch1.getName());
            ArrayList<Customer1> customersList = branch1.getCustomer1();
            for(int i = 0; i < customersList.size(); i++) {
                Customer1 customer1 = customersList.get(i);
                System.out.println("Customer #" + (i + 1) + ". " + customer1.getName());

                if(showTransaction) {
                    System.out.println("Transaction: ");
                    ArrayList<Double> transaction = customer1.getTransactions();
                    for(int j = 0; j < transaction.size(); j++) {
                        System.out.println("Transaction #" + (j + 1) + ". " + transaction.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}
