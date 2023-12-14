package org.condingconcepts.threads.numberprinterexecutors;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Instead of creating a Thread obj
//        Executor executor = Executors.newSingleThreadExecutor();
        Executor executor = Executors.newSingleThreadExecutor();
        for(int i=0; i<=100; i++){
            executor.execute(new NumberPrinterExecutors(i));

            if(i == 40) {
                System.out.println("debug");
            }
        }
    }
}
