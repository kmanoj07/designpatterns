package org.condingconcepts.threads.addersubtracter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Value value = new Value(); // shared value obj
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Adder(value));
        executorService.execute(new Subtracter(value));

        executorService.shutdown();// it signals the executor service please finish the current task first and after that I shutdown
        // here are waiting for all the task to finish after the shutdown
        executorService.awaitTermination(1L, TimeUnit.MINUTES);
        System.out.println("Final value: " + value.getValue());
    }
}
