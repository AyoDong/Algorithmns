package com.sheldon.basic;

import java.lang.ref.*;
import java.util.LinkedList;

public class ReferenceDemo {

    private static ReferenceQueue<ReferenceVeryBigDemo> rq = new ReferenceQueue<>();

    public static void checkQueue(){
        Reference<? extends ReferenceVeryBigDemo> inq = rq.poll();
        if(inq != null){
            System.out.println("In Queue: " + inq.get());
        }
    }

    public static void main(String[] args) {
        int size = 10;

        LinkedList<SoftReference<ReferenceVeryBigDemo>> sa = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            sa.add(new SoftReference<ReferenceVeryBigDemo>(new ReferenceVeryBigDemo("Soft " + i), rq));
            System.out.println("Just created: " + sa.getLast());
            checkQueue();
        }

        LinkedList<WeakReference<ReferenceVeryBigDemo>> wa = new LinkedList<>();
        for(int i=0; i<size; i++){
            wa.add(new WeakReference<ReferenceVeryBigDemo>(new ReferenceVeryBigDemo("Weak " + i), rq));
            System.out.println("Just created: "+wa.getLast());
            checkQueue();
        }
        SoftReference<ReferenceVeryBigDemo> s = new SoftReference<>(new ReferenceVeryBigDemo("Soft"));
        WeakReference<ReferenceVeryBigDemo> w = new WeakReference<>(new ReferenceVeryBigDemo("Weak"));
        LinkedList<PhantomReference<ReferenceVeryBigDemo>> pa = new LinkedList<>();
        for(int i=0; i<size; i++){
            pa.add(new PhantomReference<ReferenceVeryBigDemo>(new ReferenceVeryBigDemo("Phantom " +i), rq));
            System.out.println("Just created: " + pa.getLast());
            checkQueue();
        }
    }
}