package org.condingconcepts.threads.numberprinter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();

        for (int i=1; i<=100; i++) {
//            Thread t = new Thread(new PrintNumber());
//            t.start();
            Thread t2 = new Thread(new NumberPrinter(i));
            t2.start();
            threads.add(t2);

            if(i == 40) {
                System.out.println("Debug");
            }
        }
    }
}
