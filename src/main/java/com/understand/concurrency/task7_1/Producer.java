package com.understand.concurrency.task7_1;

import java.util.Queue;
import java.util.UUID;

public class Producer implements Runnable {

    private Queue<String> queue;

    public Producer(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        queue.offer(Thread.currentThread().getName() + " id " + UUID.randomUUID());
    }
}