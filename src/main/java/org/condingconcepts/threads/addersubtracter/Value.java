package org.condingconcepts.threads.addersubtracter;

public class Value {
    private int value = 0;
    public synchronized void add(int i) {
        value += i;
    }
    // lets allow only one thread to be entered in this method one at time
    public synchronized void subtract(int i) {
        value -= i;
    }
    public int getValue() {
        return value;
    }
}
