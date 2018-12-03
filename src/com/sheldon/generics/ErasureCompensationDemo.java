package com.sheldon.generics;

public class ErasureCompensationDemo<T> {


    private final int SIZE = 100;
    public void f(Object arg){
        T[] array = (T[]) new Object[SIZE];
    }
    public T generics(T a,String hello){
        return null;
    }
}
