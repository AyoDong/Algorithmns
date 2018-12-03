package com.sheldon.basic;

import java.util.List;

public class GenericsMethodDemo {

    public static <T> void methodTry(T obj){
        if(obj instanceof String){
            System.out.println("String : " + obj);
        }else if(obj instanceof Integer){
            System.out.println("Integer : " + obj);
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        Integer i = 10;
        methodTry(str);
        methodTry(i);

        List<String> list = null;

        if(null == list || list.isEmpty()){
            System.out.println("list null");
        }

    }
}
