package org.condingconcepts.threads.numberprinterexecutors;

public class NumberPrinterExecutors implements Runnable {
    private int number;
    public NumberPrinterExecutors(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number+ " current thread " + Thread.currentThread().getName());
    }

}
