package com.sheldon.concurrency;

public class ADaemonDemo {

    public static void main(String[] args) {
        Thread t = new Thread(new ADeamon());
        t.setDaemon(true);
        t.start();
    }
}

class ADeamon implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("Starting a Thread");
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("This is the finally function");
        }
    }
}