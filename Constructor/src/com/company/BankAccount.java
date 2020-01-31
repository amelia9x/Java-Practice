package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("45353",2.5, "Default Name",
                "Default address", "Default Number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName,
                       String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance; // Chú ý kẻo gây lỗi overflow, nãy mình để nhầm
        // là this.getBalance(); => chạy hoài không ra luôn
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double depositFund(double amount) {
        return (this.balance += amount);
    }

    public double withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Your balance is insufficient!");
            return this.balance;
        } else {
            return (this.balance -= amount);
        }
    }

    // Hoặc cách bên dưới cho deposit với withdraw
    /*public void depositFund (double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Only " +  this.balance + " available. Withdraw not processed.");
        }
        else {
            this.balance -= amount;
            System.out.println("Withdraw of " + amount + " processed. Remaining balance is " + this.balance);
        }
    }*/
}