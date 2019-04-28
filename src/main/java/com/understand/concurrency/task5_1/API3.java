package com.understand.concurrency.task5_1;

import com.understand.concurrency.utils.ThreadUtils;

import java.util.logging.Logger;

public interface API3 {
    static String execute(Byte b) {
        ThreadUtils.sleepRandom(10, 300);
        Logger.getGlobal().info("API 3 has done calculation with key " + b);
        return "Done";
    }
}
