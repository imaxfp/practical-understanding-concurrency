package com.understand.concurrency.task5;

import com.understand.concurrency.utils.ThreadUtils;

import java.util.logging.Logger;

public class SecurityAPI2 {

    public static Long amountTransactions(String userToken) {
        ThreadUtils.sleepRandom(10, 500);
        Logger.getGlobal().info("Transaction pool for the user has been unlocked. Ready for use");
        return 10L;
    }
}
