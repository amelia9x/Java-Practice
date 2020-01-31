package com.company;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
//        ReentrantLock reentrantLock = new ReentrantLock();
	    BankAccount account = new BankAccount("12345-678", 1000.00);

//	    Thread thread1 = new Thread() {
////            public void run() {
////                account.deposit(300.00);
////                account.withdraw(50.00);
////            }
////        };
////
////	    Thread thread2 = new Thread() {
////            @Override
////            public void run() {
////                account.deposit(203.75);
////                account.withdraw(100.00);
////            }
////        };

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        });

        thread1.start();
	    thread2.start();
    }
}
