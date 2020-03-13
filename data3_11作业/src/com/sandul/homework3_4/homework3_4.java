package com.sandul.homework3_4;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class homework3_4 {
    public static void main(String[] args) {
        TreeSet<Integer> arr = new TreeSet<>();
        arr.add(30);
        arr.add(20);
        arr.add(50);
        arr.add(10);
        arr.add(30);
        arr.add(20);
        System.out.println(arr.size());
        //因为Set集合是不能重复的
        for (Integer num : arr) {
            if (num>25){
                System.out.println(num);
            }

        }
    }
}
