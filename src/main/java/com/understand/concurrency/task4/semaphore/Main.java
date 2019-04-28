package com.understand.concurrency.task4.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static ExecutorService executor = Executors.newCachedThreadPool();
    private static List<String> documents = new ArrayList<String>() {
        {
            add("DOC 1");
            add("PDF 1");
            add("PDF 2");
            add("PDF 3");
            add("PDF 4");
        }
    };

    public static void main(String[] args) {
        Printer printer = new Printer();
        documents.forEach(d -> executor.execute(printer.task(d)));
    }
}
