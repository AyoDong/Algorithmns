package com.sheldon.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRemoveDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] a = {"A", "B", "C", "D"};
        list.addAll(Arrays.asList(a));
        list.remove(0);

        for (String l : list ){
            System.out.println(l);
        }
    }
}
