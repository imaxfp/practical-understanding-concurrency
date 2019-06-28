package com.understand.concurrency.task4.countdownlatch;

import com.understand.concurrency.utils.ThreadUtils;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

public class VideoConference {

    private CountDownLatch latch;

    public VideoConference(int amount) {
        this.latch = new CountDownLatch(amount);
    }

    public Runnable task = () -> {
        Logger.getGlobal().info("The session is initiated. Total participants should be  " + latch.getCount());
        try {
            latch.await();
            Logger.getGlobal().info("All the participants have arrived. Video conference has started");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    public Runnable arrive(String name) {
        // TODO the current string should be returned to the main thread: "Hello from <name>!"
        return () -> {
            ThreadUtils.sleepRandom(100, 500);
            Logger.getGlobal().info(name + " has arrived - " + Thread.currentThread().getName());
            latch.countDown();
            Logger.getGlobal().info("The video conference is waiting for " + latch.getCount() + " participants");
        };
    }
}
