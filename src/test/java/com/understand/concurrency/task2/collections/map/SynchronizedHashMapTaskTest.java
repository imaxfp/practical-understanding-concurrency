package com.understand.concurrency.task2.collections.map;

import com.understand.concurrency.task2.collections.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class SynchronizedHashMapTaskTest extends BaseTest {

    private Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());


    @Test(threadPoolSize = THREAD_POOL_SIZE, invocationCount = INVOCATION_COUNT)
    public void atomic() {
        map.put(counter.getAndIncrement(), Thread.currentThread().getName());
    }

    @AfterClass
    public void check() {
        assertEquals(map.keySet().size(), INVOCATION_COUNT);
    }
}