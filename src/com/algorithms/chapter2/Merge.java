package com.algorithms.chapter2;

public class Merge extends Example {

    public Comparable[] aux;

    public Merge(){}

    public Merge(Comparable[] a){
        aux = new Comparable[a.length];
    }

    public void merge(Comparable[] a, int lo, int mid, int hi){
        int i = lo, j = mid + 1;

        for(int k = lo; k < hi; k++){
            aux[k] = a[k];
        }

        for(int k = lo; k < hi; k++){
            if(i > mid){
                a[k] = a[j++];
            }else if(j > hi){
                a[j] = a[i++];
            }else if(less(a[i], a[j])) {
                a[k] = a[i++];
            }else{
                a[k] = a[j++];
            }
        }
    }
}
