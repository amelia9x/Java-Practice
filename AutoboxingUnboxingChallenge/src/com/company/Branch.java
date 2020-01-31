package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void printCustomerList() {
        System.out.println("Customer List: ");
        for(int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i).getName());
        }
    }

    public boolean addNewCustomber (String customerName, double amount) {
        if(findCustomer(customerName) >= 0) {
            System.out.println("Customer with name " + customerName +
                    " already in branch list.");
            return false;
        }
        else {
            Customer customer = new Customer(customerName);
            customerList.add(customer);
            customer.transactionForTimes(amount);
            System.out.println("Customer " + customer.getName() + " is added successfully." +
                    " First transaction with " + amount + "$.");
            return false;
        }
    }

    public void addTransaction (String customerName, double amount) {
        int postion = findCustomer(customerName);
        if(postion < 0) {
            System.out.println("Customer with name " + customerName +
                    " is not in branch list.");
        }
        else {
            customerList.get(postion).transactionForTimes(amount);
        }
    }

    public int findCustomer(String name) {
        for(int i = 0; i < customerList.size(); i++) {
            Customer customer = customerList.get(i);
            if(customer.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
