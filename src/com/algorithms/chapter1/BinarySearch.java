package com.algorithms.chapter1;

import java.text.DateFormat;
import java.util.Date;

public class BinarySearch {

    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            if(key < a[mid]){
                hi = mid - 1;
            }else if(key > a[mid]){
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static int rank(int key, int[] a, int lo, int hi){
        if(lo > hi){
            return -1;
        }
        int mid = lo + (hi - lo)/ 2;
        if(key < mid){
           return rank(key, a, lo, mid - 1);
        }else if(key > mid){
           return rank(key, a, mid + 1, hi);
        }else{
            return mid;
        }
    }

    public static void main(String[] args) {
        Date date = new Date();
        String str = DateFormat.getDateInstance().format(date);
        System.out.println(str);
    }
}
