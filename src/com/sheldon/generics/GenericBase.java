package com.sheldon.generics;

public class GenericBase<T> {
    private T element;

    public void set (T arg){
        arg = element;
    }

    public T get(){
        return element;
    }

    public static void main(String[] args) {
        DerivedGeneric d = new DerivedGeneric();
        Object obj = d.get();
        d.set("STRING");
        System.out.println(d);
    }
}

class DerivedGeneric extends GenericBase{}


