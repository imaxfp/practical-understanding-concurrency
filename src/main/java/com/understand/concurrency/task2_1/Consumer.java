package com.understand.concurrency.task2_1;

import java.util.Queue;

public class Consumer extends Thread {
    private Queue<Integer> queue;
    private int maxSize;

    public Consumer(Queue<Integer> queue, int maxSize, String name) {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
      //TODO implement me
    }
}

