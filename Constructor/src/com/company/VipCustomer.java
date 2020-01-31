package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Anh", 1000.1, "ka.vn@gmail.com" );
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "anhnhhk@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
