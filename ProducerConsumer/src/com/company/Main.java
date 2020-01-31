package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
//        ReentrantLock reentrantLock = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_RED + "I'm being printed for Callable class");
                return ThreadColor.ANSI_RED + "This is the Callable result.";
            }
        });

        try {
            System.out.println(future.get());
        } catch (ExecutionException e) {
            System.out.println("Something went wrong");
        } catch (InterruptedException e) {
            System.out.println("I'm was interrupted");
        }

        executorService.shutdown();
    }
}


class MyProducer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;
//    ReentrantLock reentrantLock;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        String[] numA = {"1", "2", "3", "4", "5"};
        Random random = new Random();
        for (int i = 0; i < numA.length; i++) {
            try {
                System.out.println(color + "Adding..." + numA[i]);
                buffer.put(numA[i]);
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println(color + "MyProducer is interrupted.");
            }
        }
        System.out.println(color + "EOF is adding, it's over.");
        try {
            buffer.put("EOF");
        } catch (InterruptedException e) {

        }
    }
}

class MyConsumer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equals(Main.EOF)) {
                        System.out.println(color + "Exiting");
                        break;
                    } else {
                        System.out.println(color + "Remove " + buffer.take());
                    }
                } catch (InterruptedException e) {

                }
            }
        }
    }
}