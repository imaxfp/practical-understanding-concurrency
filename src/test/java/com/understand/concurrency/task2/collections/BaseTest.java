package com.understand.concurrency.task2.collections;

import java.util.concurrent.atomic.AtomicInteger;

public class BaseTest {

    protected static final int THREAD_POOL_SIZE = 500;
    protected static final int INVOCATION_COUNT = 50_00;

    protected AtomicInteger counter = new AtomicInteger();
}


