package org.condingconcepts.threads.multithreadedmergesort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> list;
    private ExecutorService executor;
    public Sorter(List<Integer> list, ExecutorService executor) {
        this.list = list;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {

        if(list.size() <= 1) {
            return list;
        }

        int mid = list.size()/2;

        List<Integer> left = new ArrayList<>();
        for(int i=0; i<mid; i++){
            left.add(list.get(i));
        }

        List<Integer> right = new ArrayList<>();
        for(int i=mid; i<list.size(); i++) {
            right.add(list.get(i));
        }

        // sorting the left side -> task -- get return value
        // sorting the right side -> task
//        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> leftSortedFuture = executor.submit(new Sorter(left, executor));
        Future<List<Integer>> rightSortedFuture = executor.submit(new Sorter(right, executor));

        List<Integer> sortedLeft = leftSortedFuture.get();
        List<Integer> sortedRight = rightSortedFuture.get();

        // merge part
        List<Integer> finalList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < sortedLeft.size() && j < sortedRight.size()) {
            if(sortedLeft.get(i) < sortedRight.get(j)) {
                finalList.add(sortedLeft.get(i));
                i++;
            } else {
                finalList.add(sortedRight.get(j));
                j++;
            }
        }
        while (i < sortedLeft.size()) {
            finalList.add(sortedLeft.get(i));
            i++;
        }
        while(j < sortedRight.size()) {
            finalList.add(sortedRight.get(j));
            j++;
        }
        return finalList;
    }
}
