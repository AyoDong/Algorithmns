package com.sheldon.algorithm;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * average case performance :   O(n log n)
 * worst case performance   :   O(n log n)
 *
 * */

public class SortMergeAlgorithm {

    public static int[] sort(int[] a, int low, int high){
        int mid = (low + high) / 2;
        if(low < high){
            sort(a, low, mid);
            sort(a, mid + 1, high);
        }
        return a;
    }

    public static void merge(int[] a, int low, int mid, int high){
        int[] temp = new int[high - low +1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= high){
            if(a[i] < a[j]){

            }
        }
    }

    public static void main(String[] args) {
        Date b = new Date();
        System.out.println(b);
    }
}
