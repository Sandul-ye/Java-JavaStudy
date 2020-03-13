package com.sandul.demo01;


import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        Collections.addAll(arr,"张三","李四","王五","刘六");
        System.out.println(arr);
        arr.add("张飞");
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        arr.set(0,"li四");
        System.out.println(arr.get(0));
        System.out.println(arr);


    }
}
