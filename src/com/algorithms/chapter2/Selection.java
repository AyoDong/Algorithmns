package com.algorithms.chapter2;

import java.util.Arrays;

public class Selection extends Example{

    @Override
    public void sort(Comparable[] a){
        for(int i = 0; i < a.length; i++){
            int minimum = i;
            for(int j = i + 1; j < a.length; j++){
                if(less(a[j], a[minimum])){
                    minimum = j;
                }
                exch(a, j, minimum);
            }
        }
    }

    public static void main(String[] args) {
        String[] str = {"S", "O", "R", "T", "G", "O", "O", "D"};
        new Selection().sort(str);
        System.out.println(Arrays.toString(str));
        System.out.println(16/3);
    }
}
