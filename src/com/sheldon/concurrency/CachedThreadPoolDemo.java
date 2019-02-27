package com.sheldon.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

    //The sequence of the Thread is up to the OS
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 4; i++) {
            executor.execute(new ThreadInitDemo());
        }
        executor.shutdown();
    }
}
