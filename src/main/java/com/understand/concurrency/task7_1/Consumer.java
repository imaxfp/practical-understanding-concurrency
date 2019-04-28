package com.understand.concurrency.task7_1;

import java.util.Date;
import java.util.Queue;
import java.util.logging.Logger;

public class Consumer implements Runnable {
    private final Queue<String> queue;

    public Consumer(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Logger.getGlobal().info("Consumer Started at " + new Date());
        queue.poll();
    }

}

