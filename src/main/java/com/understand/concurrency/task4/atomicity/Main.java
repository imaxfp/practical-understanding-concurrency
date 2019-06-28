package com.understand.concurrency.task4.atomicity;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static ExecutorService executor = Executors.newCachedThreadPool();
    private static List<String> documents = Arrays.asList(
            "DOC 1",
            "PDF 1",
            "PDF 2",
            "PDF 3",
            "PDF 4"
    );

    public static void main(String[] args) {
        Printer printer = new Printer();
        documents.forEach(d -> executor.execute(printer.task(d)));
    }
}
