package com.understand.concurrency.task2.lock;

import com.understand.concurrency.utils.ThreadUtils;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTask {

    private static ReentrantLock lock = new ReentrantLock();

    private static int i = 0;

    public static void increment() {
        lock.lock();
        try {
            i++;
            ThreadUtils.sleep(100);
        } finally {
            lock.unlock();
        }
    }

    public static int getI() {
        return i;
    }
}
