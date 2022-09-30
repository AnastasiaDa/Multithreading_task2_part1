package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    final static int N = 4;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Callable myCallable = new MyCallable();

        ExecutorService pool = Executors.newFixedThreadPool(4);

//        List<Callable<Integer>> tasks = new ArrayList<>();
//        tasks.add(myCallable);
//        tasks.add(myCallable);
//        tasks.add(myCallable);
//
//        pool.invokeAll(tasks);

        Future<Integer> task1 = pool.submit(myCallable);
        Future<Integer> task2 = pool.submit(myCallable);
        Future<Integer> task3 = pool.submit(myCallable);

        pool.shutdown();

    }
}
