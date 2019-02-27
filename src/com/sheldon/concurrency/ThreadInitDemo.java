package com.sheldon.concurrency;

public class ThreadInitDemo implements Runnable {

    protected int countDown = 10;
    private static int taskCount =0;
    private final int id = taskCount++;

    public ThreadInitDemo(){}
    public ThreadInitDemo(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ").";
    }

    @Override
    public void run() {
        while(countDown -- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
