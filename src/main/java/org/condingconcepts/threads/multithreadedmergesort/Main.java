package org.condingconcepts.threads.multithreadedmergesort;


import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(4, 2, 3, 1, 5);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<java.util.List<Integer>> sortedList = executorService.submit(new Sorter(list, executorService));
        List<Integer> finalList =  sortedList.get();
        System.out.println(finalList);
    }
}
