package com.understand.concurrency.task5;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

public class CompletableFutureCombineTask {

    public Boolean authAndSend(String secretId) throws ExecutionException, InterruptedException {
        CompletableFuture<String> secureAPI1 = CompletableFuture.supplyAsync(() -> SecurityAPI1.auth(secretId));
        CompletableFuture<Long> secureAPI2 = CompletableFuture.supplyAsync(() -> SecurityAPI2.amountTransactions(secretId));
        CompletableFuture<Boolean> res = secureAPI2.thenCombine(secureAPI1, CompletableFutureCombineTask::executeReq);
        return res.get();
    }

    static Boolean executeReq(Long tx, String token) {
        Logger.getGlobal().info("Tx Request has been executed with " + tx + token);
        return true;
    }
}
