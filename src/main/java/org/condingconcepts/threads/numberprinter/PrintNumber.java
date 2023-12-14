package org.condingconcepts.threads.numberprinter;

public class PrintNumber implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world");
    }
}
