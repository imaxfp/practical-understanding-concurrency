package com.understand.concurrency.test4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

import static org.testng.Assert.assertEquals;

public class SemaphoreTaskTest {

    private static final int THREAD_POOL_SIZE = 500;
    private static final int INVOCATION_COUNT = 50_000;

    private AtomicInteger counter = new AtomicInteger();

    // TODO due to performance reason we cannot execute 50_000 threads simultaneously.
    // Please restrict number of the simultaneously threads to 50.
    private Semaphore semaphore = new Semaphore(INVOCATION_COUNT);


    // TODO please investigate and provide report regarding threads name and their count
    @Test(threadPoolSize = THREAD_POOL_SIZE, invocationCount = INVOCATION_COUNT)
    public void atomic() throws InterruptedException {
        semaphore.acquire();
        counter.getAndIncrement();
        semaphore.release();
    }

    @AfterClass
    public void check() {
        assertEquals(counter.get(), INVOCATION_COUNT);
    }

}