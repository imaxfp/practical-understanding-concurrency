### Source code for the book 'Practical understanding concurrency with java.'


### Task 0
```text
Clarify the difference between Runnable and Thread.
```

### Task 1
```text
Execution of thread sequence in the specific order. 
Each of the thread has unknown execution time. 
Input of the threads can be in the next order A -> B -> C. 
On the output result we should get the same order A -> B -> C.
The task1.SequenceBlocksTest has implementation with 'join()'
Please provide alternative implementation of 'join()' method. 
```

### Task 2 - increment operations in the multi-threading environment  
```text
1. Investigate simple locks mechanism with next mechanism

task2.SimpleLockTaskTest - Simple Lock with synchronization
task2.AtomicTaskTest - implementation with Atomic
task2.ReentrantLockTaskTest - implementation from java.util.concurrent

2. Provide 'lock' implementation for the READ and WRITE operations.

3. Provide implementation with unit tests for the next classes: 

For the next locks 'Read Lock' and 'Write Lock' should be implemented. 
ReentrantReadWriteLock 
StampedLock

For the Maps, threads should use incremented value as a KEY. VALUE should be thread name.  
ConcurrentHashMap
ConcurrentNavigableMap
ConcurrentSkipListMap

4. Tests for the all implementations should be developed into 'src.test.java.com.understand.concurrency.task2'
All tests should be executed into multi-concurrent mode 'threadPoolSize = 500, invocationCount = 500'.
Please see examples into the 'src.test.java.com.understand.concurrency.task2.lock'
Provide time execution measurement for the ALL tests. Collect and share time measurement results.      
```

### Task 2_1 - Locking with Conditions 'wait(), notify() and notifyAll()'
```text
Provide implementation for produer / consumer problem. Use wait(), notify()
For the implementation unit tests have to be developed. 
```

### Task 3 - Runnable, Callable and Future
```text
Current implementation of 'com.understand.concurrency.task3.ExecutorsTask.task' cannot return 
result of the thread execution to the main thread. Provide implementation for the returning result from 'ExecutorsTask.task'
to the main thread. 
```

### Task 3_1 - Callables and Futures asynchronous execution.
```text
Current 'task4.RemoteAPI'remote API has blocking implementation. unblocking solution should be implemented. 
``` 

### Task 4 - Java concurrency framework.
```text
1. Go to the 'task5.countdownlatch' video conference will be started when each of the participant arrived.

Please provide implementation
1.1 Each of the participant should say 'hello' in the main thread.
 
2. Go to the 'task5.countdownlatch' -
2.2 Documents from the printing line should be printed twice.

3. Go to the 'task5.semaphore' - Current implementation has restricted line with semaphore.
3.3 Please provide implementation for document order. 
Documents printing should be organized with first-in first-out order. 
```

### Task 5 - CompletableFuture combine task.
```text
For execution of request, user has to be utherizated with 2 security APIs. Each of the APIs has some delay 
of authorization. In other words we do not know exactly which API will finished firstly.
Current implementation   
```

### Task 5_1 - CompletableFuture combine task.
```text
Provide working implementation without sleep in the main application.
```

### Task 6 - Executor.
```text
Improve current implementation into 'task6.ExecutorTask' for execution current task periodically in the loop.
```

### Task 7 - Producer Consumer blocking mechanism.
```text
Provide thread safe implementation for the producer consumer pattern. 
For the implementation unit tests have to be developed 'threadPoolSize = 500, invocationCount = 500'.  
```

### Task 7_1 - Producer Consumer non-blocking mechanism.
```text
Provide thread safe implementation for the producer consumer pattern with non-blocking mechanism.
For the implementation unit tests have to be developed 'threadPoolSize = 500, invocationCount = 500'.  
```    
 


