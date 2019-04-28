package com.understand.concurrency.task4.cyclicbarrier;

import java.util.ArrayList;
import java.util.List;

public class Main {

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
        Printer printer = new Printer(documents);
        printer.printQueue();
    }
}
