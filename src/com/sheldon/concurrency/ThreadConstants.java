package com.sheldon.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadConstants {
    public static final List<String> threadList = new ArrayList<>();

    static {
        threadList.add("A");
        threadList.add("B");
        threadList.add("C");
    }
}
