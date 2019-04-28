package com.understand.concurrency.task5_1;

import com.understand.concurrency.utils.ThreadUtils;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        CompletableFuture<Long> api1 = CompletableFuture.supplyAsync(() -> API1.execute(1));
        CompletableFuture<Byte> api2 = api1.thenApplyAsync(API2::execute);
        CompletableFuture<String> api3 = api2.thenApplyAsync(API3::execute);
        api3.thenAccept(System.out::print);
        //TODO remove me and provide implementation without sleep.
        ThreadUtils.sleep(10000);
    }
}
