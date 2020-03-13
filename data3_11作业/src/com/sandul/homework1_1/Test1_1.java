package com.sandul.homework1_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        System.out.println(arr);
        System.out.println("--------------");

        // 打乱集合中数据顺序
        Collections.shuffle(arr);
        System.out.println(arr);
        System.out.println("--------------");
        //升序排序
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("--------------");
        //降序
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(arr);

    }
}
