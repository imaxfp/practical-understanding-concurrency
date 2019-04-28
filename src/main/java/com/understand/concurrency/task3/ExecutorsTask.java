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

    public static void main(String args[]) {
        Thread t = new Thread(ExecutorsTask.task);
        //TODO t.start() should return the result to the main thread and print the result to the 'Logger.getGlobal().info'
        t.start();
    }
}
