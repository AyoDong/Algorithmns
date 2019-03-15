package com.algorithms.chapter2;

import java.util.Arrays;

public class Shell extends Example{

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while(h < N / 3){
            h = h * 3 + 1;
        }
        while(h >= 1){
            for(int i = h; i < N; i++){
                for(int j = i; j >= h && less(j, j - h); j -= h){
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        String[] str = {"S", "O", "R", "T", "G", "O", "O", "D"};
        new Shell().sort(str);
        System.out.println(Arrays.toString(str));
    }
}
