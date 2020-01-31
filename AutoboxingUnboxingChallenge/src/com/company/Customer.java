package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name) {
        this.name = name;
        this.transaction = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void transactionForTimes (double amount) {
        transaction.add(amount);
        System.out.println("You just add " + amount + " in bank account.");
    }

    public void listTransaction() {
        System.out.println("Transaction list: ");
        for(int i = 0; i < transaction.size(); i++) {
            System.out.println("Transaction #" + (i + 1) + ". " + transaction.get(i));
        }
    }

}
