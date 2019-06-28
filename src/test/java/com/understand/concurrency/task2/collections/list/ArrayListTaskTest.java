package com.understand.concurrency.task2.collections.list;

import com.understand.concurrency.task2.collections.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ArrayListTaskTest extends BaseTest {

    private List<Integer> list = new ArrayList<>();

    @Test(threadPoolSize = THREAD_POOL_SIZE, invocationCount = INVOCATION_COUNT)
    public void atomic() {
        list.add(counter.getAndIncrement());
    }

    @AfterClass
    public void check() {
        assertEquals(list.size(), INVOCATION_COUNT);
    }
}