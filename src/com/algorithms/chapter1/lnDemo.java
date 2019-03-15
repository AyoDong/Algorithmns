package com.algorithms.chapter1;

public class lnDemo {

    public static int lnFunc(int n){
        if(n == 1)
            return 1;
        /**
         * return lnFunc(n * (n - 1)) is fucking wrong, which will make a infinite loop,
         * cuz the n would be expanded simultaneously.
         */
        return n * lnFunc(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(lnFunc(3));
    }
}
