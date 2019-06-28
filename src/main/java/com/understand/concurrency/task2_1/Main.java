package com.understand.concurrency.task2_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger.getGlobal().info("Solving Producer/Consumer Problem with 'wait()' 'notify()' implementation");

        // In this task Producer/Consumers must take care of Queue synchronization
        Queue<Integer> buffer = new LinkedList<>();

        Thread producer = new Producer(buffer, 10, "Producer");
        Thread consumer = new Consumer(buffer, "Consumer");
        producer.start();
        consumer.start();
    }


}
