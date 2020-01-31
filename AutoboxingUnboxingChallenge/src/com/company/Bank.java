package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();

    public void printBranchList(String branchName, String customerName) {
        System.out.println("Branch List: ");
        for(int i = 0; i < branches.size(); i++) {
            System.out.println((i + 1) + ". " + branches.get(i).getBranchName());
        }
        int positionOfBranch =  findBranch(branchName);
        if (positionOfBranch < 0){
            System.out.println("Branch with name " + branchName +
                    " is not in branches list.");
        }
        else{
            branches.get(positionOfBranch).printCustomerList();
            int positionOfCustomer = branches.get(positionOfBranch).findCustomer(customerName);
            if(positionOfCustomer < 0) {
                System.out.println("Customer with name " + customerName +
                        " is not in branch list.");
            }
            else {
                branches.get(positionOfBranch).getCustomerList().get(positionOfCustomer).listTransaction();
            }
        }
    }

    public void addNewBranch(String branchName) {
        if (findBranch(branchName) >=0){
            System.out.println("Branch with name " + branchName +
                    " already in branches list.");
        }
        else{
            branches.add(new Branch(branchName));
            System.out.println("Branch with name " + branchName +
                    " is added successfully to branches list.");
        }
    }

    public void addCustomerToBranched(String branchName, String customerName, double amount) {
        int position =  findBranch(branchName);
        if (position < 0){
            System.out.println("Branch with name " + branchName +
                    " is not in branches list.");
        }
        else{
            Customer customer = new Customer(customerName);
            branches.get(position).addNewCustomber(customerName, amount);
            int positionCustomber = branches.get(position).findCustomer(customerName);
            if(positionCustomber < 0) {
                System.out.println(customerName +
                        " is added successfully to branch with name " + branchName);
            }
        }
    }

    public void addTransactionForCustomerInBranch (String branchName, String customerName, double amount) {
        int position =  findBranch(branchName);
        if (position < 0){
            System.out.println("Branch with name " + branchName +
                    " is not in branches list.");
        }
        else{
            Customer customer = new Customer(customerName);
            branches.get(position).addTransaction(customerName, amount);
            System.out.println("Transaction with " + amount +
                    "$ is added successfully to customer " + customerName + " and branch with name " + branchName);
        }
    }

    private int findBranch(String name) {
        for(int i = 0; i < branches.size(); i++) {
            Branch branch1 = branches.get(i);
            if(branch1.getBranchName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
