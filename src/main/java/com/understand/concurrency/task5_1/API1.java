package com.understand.concurrency.task5_1;

import com.understand.concurrency.utils.ThreadUtils;

import java.util.logging.Logger;

public interface API1 {
    static Long execute(Integer id) {
        ThreadUtils.sleepRandom(10, 300);
        Logger.getGlobal().info("API 1 has done calculation with id " + id);
        return 1L;
    }
}
