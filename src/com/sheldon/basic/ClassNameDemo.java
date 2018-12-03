package com.sheldon.basic;

public class ClassNameDemo {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        try {
            Class classGum = Class.forName("com.sheldon.basic.Gum");
            System.out.println(classGum.toString());
            System.out.println(classGum.toGenericString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        new Cookie();
    }
}

class Gum{
static {
    System.out.println("Loading Gum");
        }
}

class Cookie{
    static{
        System.out.println("Loading Cookie");
    }
}
