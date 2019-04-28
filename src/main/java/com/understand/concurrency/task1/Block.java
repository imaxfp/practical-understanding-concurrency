package com.understand.concurrency.task1;

import com.understand.concurrency.utils.ThreadUtils;

import java.util.List;
import java.util.logging.Logger;

public class Block implements Runnable {

    private Character name;
    private List<Character> result;


    public Block(Character name, List<Character> result) {
        this.name = name;
        this.result = result;
    }


    @Override
    public void run() {
        Logger.getGlobal().info("Has started building process ... " + name);
        ThreadUtils.sleepRandom(1, 3);
        result.add(name);
        Logger.getGlobal().info(name + "Has done!");
    }

}
