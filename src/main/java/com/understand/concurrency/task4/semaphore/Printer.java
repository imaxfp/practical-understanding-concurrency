package com.understand.concurrency.task4.semaphore;

import com.understand.concurrency.utils.ThreadUtils;

import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

public class Printer {

    private final Semaphore semaphore = new Semaphore(2);

    public Runnable task(String doc) {
        return () -> {
            try {
                semaphore.acquire();
                Logger.getGlobal().info(Thread.currentThread().getName() + ": is going to print document - " + doc + ")");
                ThreadUtils.sleepRandom(100, 500);
                Logger.getGlobal().info(Thread.currentThread().getName() + ": has printed document - " + doc + " ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        };
    }
}
