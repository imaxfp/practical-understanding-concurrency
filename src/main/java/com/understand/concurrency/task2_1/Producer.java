package com.understand.concurrency.task2_1;

import java.util.Queue;

public class Producer extends Thread {
    private Queue<Integer> queue;
    private int maxSize;

    /**
     * Creates a producer thread.
     *
     * @param queue   shared queue (must be synchronized)
     * @param maxSize queue maxSize
     * @param name    producer thread's name
     */
    public Producer(Queue<Integer> queue, int maxSize, String name) {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        //TODO implement me
    }
}


