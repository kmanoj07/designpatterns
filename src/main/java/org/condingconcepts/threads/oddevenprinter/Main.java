package org.condingconcepts.threads.oddevenprinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService oddExecutor = Executors.newSingleThreadExecutor();
        ExecutorService evenExecutor = Executors.newSingleThreadExecutor();
        for (int i=0; i<100; i++) {
            if(i % 2 == 0) {
                evenExecutor.execute(new OddEvenNumberPrint(i));
            } else {
                oddExecutor.execute(new OddEvenNumberPrint(i));
            }
        }
    }
}
