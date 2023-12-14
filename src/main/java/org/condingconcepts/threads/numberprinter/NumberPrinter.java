package org.condingconcepts.threads.numberprinter;

public class NumberPrinter implements Runnable {
    private int numberToPrint;
    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }
    @Override
    public void run() {

        // interrupt the execution of printing for 5000ms
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(numberToPrint);
    }
}
