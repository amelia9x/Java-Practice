package com.company;
import static com.company.ThreadColor.*;
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable implement run().");
    }
}
