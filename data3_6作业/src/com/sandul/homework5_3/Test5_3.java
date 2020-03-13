package com.sandul.homework5_3;

import java.util.ArrayList;
import java.util.List;

public class Test5_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        long start = System.currentTimeMillis();
        for (long i = 0; i < 10000000L; i++) {
            list.add(1);
        }
        long end = System.currentTimeMillis();
        System.out.print(end - start);
        System.out.println("毫秒");
    }
}
