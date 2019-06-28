package com.understand.concurrency.task3;

import java.util.concurrent.*;

public class ExecutorsTask {

    public static Runnable task = () -> {
        execute();
    };

    public static String execute() {
        try {
            TimeUnit.SECONDS.sleep(1);
            return "Task has done...";
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "Error...";
        }
    }

    public static void main(String[] args) {
        //TODO change the code to get the result of an asynchronous computation
        // and print it out in the main thread
        Thread t = new Thread(ExecutorsTask.task);
        t.start();
    }
}
