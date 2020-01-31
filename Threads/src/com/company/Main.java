package com.company;

import static com.company.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("=====Another Thread=======");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from myRunnableThread implement run()");

                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "I wait for anotherThread terminated, or time out, and execute again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I was interrupted by something.");
                }
            }
        });
        myRunnableThread.start();


        System.out.println(ANSI_PURPLE + "Hello again from main thread");

    }
}
