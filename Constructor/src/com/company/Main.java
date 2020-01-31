package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer a = new VipCustomer();
        VipCustomer b = new VipCustomer("Ha", 2000.2);
        VipCustomer c = new VipCustomer("Luca", 300.3, "luca@gmail.com");

        System.out.println(a.getName() + " " + a.getCreditLimit() + " " + a.getEmailAddress());
        System.out.println(b.getName() + " " + b.getCreditLimit() + " " + b.getEmailAddress());
        System.out.println(c.getName() + " " + c.getCreditLimit() + " " + c.getEmailAddress());

        /*BankAccount a = new BankAccount(); //("42384284029", 190_000.123, "Anh",
                //"kieuanh.jp@gmail.com", "090909090");

        BankAccount b = new BankAccount("Ha", "Ha@gmail.com", "99900077");

        System.out.println("Your bank account is " + b.getAccountNumber());
        System.out.println("Your balance is " + b.getBalance() + "$");
        System.out.println("Your name is " + b.getCustomerName());
        System.out.println("Your email is " + b.getEmail());
        System.out.println("Your phone number is " + b.getPhoneNumber());

        System.out.println("Your bank account is " + a.getAccountNumber());
        System.out.println("Your balance is " + a.getBalance() + "$");
        System.out.println("Your name is " + a.getCustomerName());
        System.out.println("Your email is " + a.getEmail());
        System.out.println("Your phone number is " + a.getPhoneNumber());*/

        /*System.out.println("Now, your balance is " + a.depositFund(100_000));
        System.out.println("After withdraw, your balance is "
                + a.withdraw(199_000.456) + "$");
        System.out.println("After withdraw, your balance is "
                + a.withdraw(100_000) + "$");*/

        // Test cho cách 2
        /*a.depositFund(100_000);
        a.withdraw(199_000.456);
        a.withdraw(100_000);*/
    }
}
