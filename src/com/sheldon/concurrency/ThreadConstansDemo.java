package com.sheldon.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadConstansDemo implements Runnable{

    @Override
    public void run() {
        for(String str : ThreadConstants.threadList){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0; i<3; i++){
            executorService.execute(new ThreadConstansDemo());
        }
        executorService.shutdown();
    }
}
