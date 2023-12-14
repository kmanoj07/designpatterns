package org.condingconcepts.threads.numberprinter;

public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
//            Thread t = new Thread(new PrintNumber());
//            t.start();
            Thread t2 = new Thread(new NumberPrinter(i));
            t2.start();
        }
    }
}
