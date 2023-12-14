package org.condingconcepts.threads.oddevenprinter;

public class OddEvenNumberPrint implements Runnable{
    private int number;
    public OddEvenNumberPrint(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println(number  + " Thread " + Thread.currentThread().getName());
    }
}
