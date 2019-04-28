package com.understand.concurrency.task0;

public class Threads {

    public static void start() {
        Thread thread = new Thread(Runnables.task);
        thread.start();
    }
}
