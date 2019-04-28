package com.understand.concurrency.task2.lock;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTask {

    private static AtomicInteger atomicI = new AtomicInteger(0);

    public static void increment() {
        atomicI.incrementAndGet();
    }

    public static int getI() {
        return atomicI.get();
    }
}
