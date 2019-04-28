package com.understand.concurrency.task6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class ExecutorTask {

    private ExecutorService executor = Executors.newCachedThreadPool();

    private static Runnable task = () -> {
        Logger.getGlobal().info("Check request has send");
    };

    public void execute() {
        executor.execute(task);
    }
}
