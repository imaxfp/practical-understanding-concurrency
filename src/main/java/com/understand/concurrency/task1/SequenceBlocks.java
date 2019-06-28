package com.understand.concurrency.task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class SequenceBlocks {

    public static List<Character> result = new CopyOnWriteArrayList<>();

    public static void build(List<Character> blocks) throws InterruptedException {

        List<Thread> threads = blocks.stream()
                .map(b -> new Thread(new Block(b, result)))
                .collect(Collectors.toList());

        for (Thread t : threads) {
            t.start();

            //TODO delete t.join() call and provide another solution
            t.join();
        }
    }
}
