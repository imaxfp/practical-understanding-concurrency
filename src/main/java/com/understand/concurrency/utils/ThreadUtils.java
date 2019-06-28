package com.understand.concurrency.utils;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ThreadUtils {

    public static void sleepRandom(int minMilliseconds, int maxMilliseconds) {
        try {
            int timeout = ThreadLocalRandom.current().nextInt(minMilliseconds, maxMilliseconds);
            TimeUnit.MILLISECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(int milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
