package com.concurrency.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SequenceBlocks {

    public static List<Character> result = new ArrayList<>();

    public static void build(List<Character> blocks) throws InterruptedException {

        List<Thread> threads = blocks
                .stream()
                .map(b -> {
                    return new Thread(new Block(b, result));
                }).collect(Collectors.toList());
        for (Thread t : threads) {
            t.start();
            //TODO implement me
            t.join();
        }
    }

}
