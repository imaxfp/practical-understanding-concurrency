package com.understand.concurrency.task2.lock;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AtomicTaskTest {

    @Test(threadPoolSize = 500, invocationCount = 500)
    public void atomic() {
        AtomicTask.increment();
    }

    @AfterClass
    public void check() {
        Assert.assertEquals(AtomicTask.getI(), 500);
    }

}