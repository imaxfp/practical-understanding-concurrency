package com.understand.concurrency.task2.lock;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ReentrantLockTaskTest {

    @Test(threadPoolSize = 500, invocationCount = 500)
    public void atomic() {
        ReentrantLockTask.increment();
    }

    @AfterClass
    public void check() {
        Assert.assertEquals(ReentrantLockTask.getI(), 500);
    }
}