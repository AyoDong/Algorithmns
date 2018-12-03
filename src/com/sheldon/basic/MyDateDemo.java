package com.sheldon.basic;

import java.util.Calendar;

public class MyDateDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 01, 01);
        System.out.println(calendar.getTimeInMillis());

        calendar.set(2017, 01, 01);
        System.out.println(calendar.getTimeInMillis());

        calendar.set(2018, 01, 01);
        System.out.println(calendar.getTimeInMillis());
    }
}
