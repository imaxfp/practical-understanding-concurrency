package com.concurrency.task0;

public class Runnables {

    public static Runnable task = () -> {
        String threadName = Thread.currentThread().getName();
        System.out.println("Runnable " + threadName);
    };

    public static void run() {
        task.run();
    }

}
