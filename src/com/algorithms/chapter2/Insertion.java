package com.algorithms.chapter2;

import java.util.Arrays;

public class Insertion extends Example {

    @Override
    public void sort(Comparable[] a) {
        int length = a.length;
        //if you utilize "for()"
        for(int i = 1; i < length; i++){
            for(int j = i; j > 0 && less(j, j--); j--){
                exch(a, j, j--);
            }
        }
    }

    public static void main(String[] args) {
        String[] str = {"S", "O", "R", "T", "G", "O", "O", "D"};
        new Insertion().sort(str);
        System.out.println(Arrays.toString(str));
    }
}
