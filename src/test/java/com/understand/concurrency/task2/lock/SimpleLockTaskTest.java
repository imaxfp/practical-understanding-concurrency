package com.understand.concurrency.task2.lock;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SimpleLockTaskTest {

    @Test(threadPoolSize = 500, invocationCount = 500)
    public void atomic() {
        SimpleLockTask.increment();
    }

    @AfterClass
    public void check() {
        Assert.assertEquals(SimpleLockTask.getI(), 500);
    }
}