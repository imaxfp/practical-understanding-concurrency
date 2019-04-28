package com.understand.concurrency.task7;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new ConcurrentLinkedQueue<>();
        new Thread(new Consumer(queue)).start();
        for (int i = 0; i < 10; i++) {
            new Thread(new Producer(queue)).start();
        }
    }

}
