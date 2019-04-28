package com.understand.concurrency.task5;

import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

public class Main {

    private static CompletableFutureCombineTask combineTask = new CompletableFutureCombineTask();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        boolean res = combineTask.authAndSend("mock_secret");
        Logger.getGlobal().info("Is request has been executed - " + res);
    }
}
