package com.understand.concurrency.task3_1;

import java.util.List;
import java.util.concurrent.*;
import java.util.logging.Logger;

public class Main {

    public static void main(String args[]) throws InterruptedException, ExecutionException {
        List<Future<String>> futures = RemoteAPI.executeAllRequest();
        //TODO implement me with not blocking mechanism.
        for (Future<?> future : futures) {
            Logger.getGlobal().info(String.valueOf(future.get()));
        }
        Logger.getGlobal().info("Task finished");
    }
}
