package com.company;

import static com.company.ThreadColor.*;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Interruption wakes me up.");
            return;
        }
        System.out.println(ANSI_BLUE + "3s is passed, and I woke up.");
    }
}
