package com.understand.concurrency.task2.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTask {

    private static ReentrantLock lock = new ReentrantLock();

    private static int i = 0;

    public static void increment() {
        lock.lock();
        try {
            i++;
        } finally {
            lock.unlock();
        }
    }

    public static int getI() {
        lock.lock();
        try {
            return i;
        } finally {
            lock.unlock();
        }
    }
}
