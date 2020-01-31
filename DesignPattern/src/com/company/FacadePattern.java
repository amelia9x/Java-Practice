package com.company;

import java.math.BigDecimal;
import java.util.Hashtable;

public class FacadePattern {
}

// Step 1: Design the interface
public interface IAccount {
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(BigDecimal amount);
    public int getAccountNumber();
}

// Step 2: Implement the interface with one or more classes
// Create subtype, behave like Account type
public class Chequing implements IAccount {...}
public class Saving implements IAccount {...}
public class Investment implements IAccount {...}

// Step 3: Create the facade class and wrap the classes that implement the interface
public class BankService {
    private Hashtable<int, IAccount> bankAccounts;
    public BankService() {
        this.bankAccounts = new Hashtable<int, IAccount>();
    }
    public int createNewAccount(String type, BigDecimal initAmount) {
        IAccount newAccount = null;
        switch (type) {
            case "chequing":
                newAccount = new Chequing(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                break;
            default:
                System.out.println("Invalid account type.");
                break;
        }
        if(newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal amount) {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount, amount);
    }
}

// Step 4: Use the facade class to access the subsystem
public class Customer {
    public static void main(String args[]) {
        BankService myBankService = new BankService();

        int mySaving = myBankService.createNewAccount("saving", new BigDecimal(500.00));
        int myInvesment = myBankService.createNewAccount("investment", new BigDecimal(1000.00));
        myBankService.transferMoney(mySaving, myInvesment, new BigDecimal(300.00));
    }
}

/*
- The facade design pattern:
+ Is a means to hide the complexity of a subsystem by encapsulating it behind
a unifying wrapper call a facade clas.
+ Removes the need for client classes to manage a subsystem on their own,
resulting in less coupling between the subsystem and client classes.
+ Handles instantiation and redirection of tasks to the appropriate class within
the subsystem.
+ Provides client classes with a simplified interface for the subsystem.
+ Acts simply as a point of entry to a subsystem and does not add more
functionality to the subsystem.
 */




































































