package com.understand.concurrency.task0;

import org.testng.annotations.Test;

public class ThreadsTest {

    @Test(threadPoolSize = 1, invocationCount = 5, timeOut = 10000)
    public void testStart() {
        Threads.start();
    }

}