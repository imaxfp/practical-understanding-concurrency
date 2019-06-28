package com.understand.concurrency.task4.countdownlatch;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

    private static String[] participants = {
            "Plato",
            "Socrates",
            "Aristotle",
            "Plotinus",
            "Kant"};

    private static Executor executor = Executors.newFixedThreadPool(participants.length);

    public static void main(String[] args) {
        VideoConference conference = new VideoConference(participants.length);
        executor.execute(conference.task);
        for (String s : participants) {
            executor.execute(conference.arrive(s));
        }

        // TODO after all our participants arrived print out their messages
    }
}
