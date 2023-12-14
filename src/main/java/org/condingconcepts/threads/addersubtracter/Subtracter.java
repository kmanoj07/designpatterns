package org.condingconcepts.threads.addersubtracter;

public class Subtracter implements Runnable {
    private  Value value;
    public Subtracter(Value value) {
        this.value = value;
    }
    @Override
    public void run() {
        for(int i=1; i<=100; i++) {
            try {
                Thread.sleep(5L);
            } catch (Exception e) {

            }
            this.value.subtract(i);
        }
    }
}
