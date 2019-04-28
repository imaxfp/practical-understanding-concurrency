package com.understand.concurrency.task5;

import com.understand.concurrency.utils.ThreadUtils;
import java.util.logging.Logger;

public class SecurityAPI1 {

    public static String auth(String secretId) {
        ThreadUtils.sleepRandom(10, 500);
        Logger.getGlobal().info("User has authorized, token for the user will be provided");
        return "Token_mock";
    }
}
