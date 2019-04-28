package com.understand.concurrency.task2.lock;

public class SimpleLockTask {

    private static int i = 0;

    public synchronized static void increment() {
        i += 1;
    }

    public static int getI() {
        return i;
    }
}
