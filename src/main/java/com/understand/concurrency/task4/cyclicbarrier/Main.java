package com.understand.concurrency.task4.cyclicbarrier;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<String> documents = Arrays.asList(
            "DOC 1",
            "PDF 1",
            "PDF 2",
            "PDF 3",
            "PDF 4"
    );

    public static void main(String[] args) {
        Printer printer = new Printer(documents);
        printer.printQueue();
    }
}
