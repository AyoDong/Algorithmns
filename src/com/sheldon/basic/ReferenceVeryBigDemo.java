package com.sheldon.basic;

public class ReferenceVeryBigDemo {
    private static final int SIZE = 10000;
    private long[] la = new long[SIZE];
    private String ident;

    public ReferenceVeryBigDemo(String id){
        this.ident = id;
    }

    @Override
    public String toString() {
        return ident;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing " + ident);
    }
}
