package com.understand.concurrency.task3_1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class RemoteAPI {

    public static ExecutorService executor = Executors.newCachedThreadPool();

    private static Callable<String> task0 = () -> {
        try {
            TimeUnit.SECONDS.sleep(1);
            return "task 0 has done...";
        } catch (InterruptedException e) {
            throw new IllegalStateException("task interrupted", e);
        }
    };

    private static Callable<String> task1 = () -> {
        try {
            TimeUnit.SECONDS.sleep(2);
            return "task 1 has done...";
        } catch (InterruptedException e) {
            throw new IllegalStateException("task interrupted", e);
        }
    };

    public static List<Future<String>> executeAllRequest() throws InterruptedException {
        return executor.invokeAll(Arrays.asList(task0, task1));
    }

}
