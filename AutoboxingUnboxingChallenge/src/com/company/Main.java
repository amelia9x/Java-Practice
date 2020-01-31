package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank1 bank = new Bank1("National Vietnam Bank");

        if(bank.addNewBranch("Saigon")) {
            System.out.println("Saigon is creating.");
        }

        bank.addNewBranch("Hanoi");
        bank.addNewCustomerToBranch("Hanoi", "Anh", 100);
        bank.addNewCustomerToBranch("Hanoi", "Huy", 150);
        bank.addNewCustomerToBranch("Hanoi", "Ha", 200);

        bank.addNewBranch("Saigon");
        bank.addNewCustomerToBranch("Saigon", "Thuy", 100);

        bank.addCustomerTransaction("Hanoi", "Anh", 120);
        bank.addCustomerTransaction("Hanoi", "Anh", 160);
        bank.addCustomerTransaction("Hanoi", "Ha", 130);

        bank.listCustomer("Hanoi", true);

        if(!bank.addNewCustomerToBranch("Hanoi", "Anh", 123)) {
            System.out.println("Customer Anh is already in Hanoi branch list.");
        }
        if(!bank.addNewCustomerToBranch("Danang", "Anh", 123)) {
            System.out.println("Branch is not exist.");
        }

        if(!bank.addNewBranch("Saigon")) {
            System.out.println("Saigon is existed.");
        }

        if(!bank.addCustomerTransaction("Hanoi", "Luca", 678)) {
            System.out.println("Customer is not exist in branch list.");
        }

    }
}

//    private static Scanner scanner = new Scanner(System.in);
//    private static Bank bank = new Bank();
//    public static void main(String[] args) {
//        boolean quit = false;
//        printChoiceList();
//        while (!quit) {
//            System.out.println("Input choice: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 0:
//                    printChoiceList();
//                    break;
//                case 1:
//                    printDetail();
//                    break;
//                case 2:
//                    addNewBranches();
//                    break;
//                case 3:
//                    addCustomberToBranches();
//                    break;
//                case 4:
//                    addTransactionToCustomer();
//                    break;
//                case 5:
//                    quit = true;
//                    break;
//            }
//        }
//    }
//
//    public static void addNewBranches() {
//        System.out.println("Input new branch name: ");
//        String branchName = scanner.nextLine();
//        bank.addNewBranch(branchName);
//    }
//
//    public static void addCustomberToBranches() {
//        System.out.println("Input branch name: ");
//        String branchName = scanner.nextLine();
//        System.out.println("Input new customer name: ");
//        String customerName = scanner.nextLine();
//        System.out.println("Input amount for initial account: ");
//        double amount = scanner.nextInt();
//        scanner.nextLine();
//
//        bank.addCustomerToBranched(branchName,customerName, amount);
//    }
//
//    public static void addTransactionToCustomer() {
//        System.out.println("Input branch name: ");
//        String branchName = scanner.nextLine();
//        System.out.println("Input customer name: ");
//        String customerName = scanner.nextLine();
//        System.out.println("Input amount for transaction: ");
//        double amount = scanner.nextInt();
//        scanner.nextLine();
//        bank.addTransactionForCustomerInBranch(branchName, customerName, amount);
//    }
//
//    public static void printDetail(){
//        System.out.println("Please input branches name: ");
//        String branchesName = scanner.nextLine();
//        System.out.println("Please input customber name: ");
//        String customerName = scanner.nextLine();
//        bank.printBranchList(branchesName, customerName);
//    }
//
//    public static void printChoiceList() {
//        System.out.println("Below is the choice list. Press: ");
//        System.out.println("\t0 - to print choice list.\n" +
//                "\t1 - to print detail of branches, customers, transactions.\n" +
//                "\t2 - to add new branches.\n" +
//                "\t3 - to add customer to existing branch.\n" +
//                "\t4 - to add new transaction to existing customer.\n" +
//                "\t5 - to quit bank application.\n");
//    }






