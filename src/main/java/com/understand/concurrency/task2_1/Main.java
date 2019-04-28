package com.understand.concurrency.task2_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class Main {

    private static Queue<Integer> buffer = new LinkedList<>();

    public static void main(String args[]) {
        Logger.getGlobal().info("Solving Producer/Consumper Problem with 'wait()' 'notify()' implementation");
        Thread producer = new Producer(buffer, 10, "Producer");
        Thread consumer = new Consumer(buffer, 10, "Consumer");
        producer.start();
        consumer.start();
    }


}
