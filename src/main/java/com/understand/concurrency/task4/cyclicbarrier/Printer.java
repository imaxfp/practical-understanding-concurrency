package com.understand.concurrency.task4.cyclicbarrier;

import com.understand.concurrency.utils.ThreadUtils;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class Printer {

    private List<String> documents;
    private CyclicBarrier barrier;
    private ExecutorService executor = Executors.newCachedThreadPool();

    public Printer(List<String> documents) {
        this.documents = documents;
        this.barrier = new CyclicBarrier(documents.size());
    }

    private Runnable task(String document) {
        return () -> {
            Logger.getGlobal().info("printing document[" + document + "]");
            ThreadUtils.sleepRandom(1000, 5000);
            Logger.getGlobal().info("Document [" + document + "]" + " printed");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };
    }

    public void printQueue() {
        documents.forEach(d -> executor.execute(new Thread(task(d))));
    }
}
