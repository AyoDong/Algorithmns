package com.sheldon.basic;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();

        A.add("A");
        A.add("C");

        B.add("A");
        B.add("B");
        B.add("D");

        List<String> C = (List<String>) ((ArrayList<String>) B).clone();

        B.removeAll(A);

        for(String a : B){
            System.out.println(a);
        }

        for(String c : C){
            System.out.println(c);
        }
    }
}
