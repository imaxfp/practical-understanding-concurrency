# Source code for the book 'Practical understanding concurrency with java.'

## Tasks

### Task 0 - Runnable vs Thread

To clarify the difference between Runnable and Thread, please run the following tests:

- `com.understand.concurrency.task0.RunnablesTest`
- `com.understand.concurrency.task0.ThreadsTest`

and send to reviewers detailed explanation of the output.

### Task 1 - Thread's essential methods

If we spawn multiple threads, then we can hardly control
their execution oder, right ?

Please look at `com.understand.concurrency.task1.SequenceBlocks#build`. \
It spawns multiple threads and make their order sequential using `join` method.

`com.understand.concurrency.task1.SequenceBlocksTest#testBuild` checks that behaviour.

Please provide alternative solution _without_ using 'java.lang.Thread#join()' method.

### Task 2 - Changing values in a multi-threading environment

1 Please have a look at some examples:

- `com.understand.concurrency.task2.lock.SimpleLockTaskTest` - implementation using `synchronized` keyword

- `com.understand.concurrency.task2.lock.AtomicTaskTest` - implementation using classes from `java.util.concurrent.atomic` package

- `com.understand.concurrency.task2.lock.ReentrantLockTask` - implementation using classes from `java.util.concurrent.locks` package

2 Please create your own thread-safe classes with `set` and `get` methods:

- using `synchronized`

- using `java.util.concurrent.locks.ReentrantReadWriteLock`

- using `java.util.concurrent.locks.StampedLock`

You are expected to have some unit tests.

3 Please see tests under  `com.understand.concurrency.task2.collections` package,
play around a bit and write why some tests are broken.

Tests for the all implementations should be under 'src.test.java.com.understand.concurrency.task2'.
All tests should be executed into multi-concurrent mode (see, for instance, existing tests).
Provide time execution measurement for the ALL tests. Collect and share time measurement results.

### Task 2_1 - Locking with Conditions 'wait(), notify() and notifyAll()'

Provide implementation for producer / consumer problem using `wait()`, `notify()`/`notifyAll()`.

For the implementation unit tests have to be developed.

### Task 3 - Runnable, Callable and Future

Current implementation of `com.understand.concurrency.task3.ExecutorsTask#task` cannot return result of the thread execution to the main thread.

Change the code to get the result of an asynchronous computation and print it out in the main thread.

### Task 3_1 - Callables and Futures asynchronous execution

Current `com.understand.concurrency.task3_1.RemoteAPI` class has blocking implementation.

Unblocking solution should be implemented _without_ using `java.util.concurrent.CompletableFuture`.

### Task 4 - Java concurrency framework

1 Run `com.understand.concurrency.task4.countdownlatch.Main` class - the video conference will be started when all the participants arrive.

Please implement the following:

- change the method com.understand.concurrency.task4.countdownlatch.VideoConference#arrive
  to return the participant's hello-message
- when the conference starts, then print out all participants' messages in the main thread

2 Go to the `com.understand.concurrency.task4.cyclicbarrier`

Documents from the printing line should be printed twice.

3 Go to the `com.understand.concurrency.task4.atomicity`

Documents printing should be organized with first-in first-out order manner.

For instance, in the current implementation we may see the following program trace:

```log
pool-1-thread-1: is going to print document - PDF 1
pool-1-thread-2: is going to print document - PDF 2
pool-1-thread-1: has printed document - PDF 1
...
```

PDF1 and PDF2 threads are interleaved.

We want that the sequence would be like that:

```log
pool-1-thread-1: is going to print document - PDF 1
pool-1-thread-1: has printed document - PDF 1
pool-1-thread-2: is going to print document - PDF 2
pool-1-thread-2: is going to print document - PDF 2
...
```

(threads for documents are not interleaved)

Please provide implementation.

4 Please change `com.understand.concurrency.test4.SemaphoreTaskTest`
according to its TODOs then investigate and provide report regarding threads name and their count.

### Task 5 - CompletableFuture combine task

For execution of request, user has to be logged in with 2 security APIs. Each of the APIs has some delay of authorization. 
In other words we do not know exactly which API will finished firstly.

Please improve a bit current implementation.

### Task 5_1 - CompletableFuture combine task

`com.understand.concurrency.task5_1.Main#main` prints out the result of the async computation.

Please remove `ThreadUtils.sleep` call and provide alternative working implementation _without_ using `java.util.concurrent.CompletableFuture#join` call.

### Task 6 - Executor

Improve the current implementation  of `com.understand.concurrency.task6.ExecutorTask` to execute the task periodically
using `java.util.concurrent.ScheduledExecutorService`.

### Task 7 - Producer-Consumer blocking mechanism

Provide thread safe implementation for the Producer-Consumer pattern using `java.util.concurrent.BlockingQueue`
so we do not manually manage threads blocking.

For the implementation unit tests have to be developed (one of the tests should use the following settings: threadPoolSize = 500, invocationCount = 500).  

### Task 7_1 - Producer-Consumer non-blocking mechanism

Provide thread safe implementation for the producer consumer pattern with non-blocking mechanism.

There is one Producer (observable/publisher) and one or more Consumers (observable/subscribers).
After producing data Producer notifies its Consumers.

For the implementation unit tests have to be developed (one of the tests should use the following settings: threadPoolSize = 500, invocationCount = 500).  