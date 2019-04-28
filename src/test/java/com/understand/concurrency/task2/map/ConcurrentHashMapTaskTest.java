package com.understand.concurrency.task2.map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ConcurrentHashMapTaskTest {

    @Test(threadPoolSize = 500, invocationCount = 5000)
    public void atomic() {
    }

    @AfterClass
    public void check() {
    }

}