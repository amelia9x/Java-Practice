package com.company;

import java.util.ArrayList;

public class Customer1 {
    private String name;
    private ArrayList<Double> transactions;

    public Customer1(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        transactions.add(initialAmount);
    }

    public void addTransactions(double amount) {
        transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
