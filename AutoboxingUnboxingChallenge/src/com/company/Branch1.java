package com.company;

import java.util.ArrayList;

public class Branch1 {
    private String name;
    private ArrayList<Customer1> customer1;

    public Branch1(String name) {
        this.name = name;
        this.customer1 = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer1> getCustomer1() {
        return customer1;
    }

    public boolean addNewCustomer(String name, double initialAmount) {
        if(findCustomer(name) == null) {
            this.customer1.add(new Customer1(name, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransactionToCustomer(String name, double amount) {
        Customer1 customer1 = findCustomer(name);
        if(customer1 != null) {
            customer1.addTransactions(amount);
            return true;
        }
        return false;
    }

    public Customer1 findCustomer(String name) {
        for(int i = 0; i < customer1.size(); i++) {
            Customer1 checkCustomer = customer1.get(i);
            if(checkCustomer.getName().equals(name)) {
                return checkCustomer;
            }
        }
        return null;
    }
}
