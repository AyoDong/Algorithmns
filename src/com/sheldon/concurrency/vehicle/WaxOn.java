package com.sheldon.concurrency.vehicle;

import java.util.concurrent.TimeUnit;

public class WaxOn implements Runnable {
    private Car car;

    public WaxOn(Car c) {
        this.car = c;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("Wax On !");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                car.waitForBuffering();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending Wax On task");
    }
}
