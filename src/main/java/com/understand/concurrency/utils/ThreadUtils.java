package com.understand.concurrency.utils;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ThreadUtils {

    public static void sleepRandom(int minMilisecond, int maxMilisecond) {
        try {
            TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(maxMilisecond) + minMilisecond);
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
