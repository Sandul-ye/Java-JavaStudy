package com.sandul.homework3_3;

import java.util.LinkedHashSet;

public class homework3_3 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> arr = new LinkedHashSet<>();
        arr.add(20);
        arr.add(30);
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
