package com.understand.concurrency.task2_1;

import java.util.Queue;

public class Consumer extends Thread {
    private Queue<Integer> queue;

    /**
     * Creates a consumer thread.
     *
     * @param queue shared queue (must be synchronized)
     * @param name  consumer thread's name
     */
    public Consumer(Queue<Integer> queue, String name) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        //TODO implement me
    }
}

