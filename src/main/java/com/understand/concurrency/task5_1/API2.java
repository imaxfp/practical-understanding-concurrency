package com.understand.concurrency.task5_1;

import com.understand.concurrency.utils.ThreadUtils;

import java.util.logging.Logger;

public interface API2 {
    static Byte execute(Long id) {
        ThreadUtils.sleepRandom(10, 300);
        Logger.getGlobal().info("API 2 has done calculation by token " + id);
        return 1;
    }
}
