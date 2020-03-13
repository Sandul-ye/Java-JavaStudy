package com.sandul.homework3_1;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class homework3_1 {
    public static void main(String[] args) {

        Set arr = new LinkedHashSet();
        arr.add("刘备");
        arr.add("关羽");
        arr.add("张飞");
        arr.add("刘备");
        arr.add("关羽");
        System.out.println(arr.size());
        //迭代器遍历集合
        System.out.println("迭代器");
        Iterator arrI = arr.iterator();
        while (arrI.hasNext()){
            System.out.println(arrI.next());
        }

        System.out.println("增强for");
        for (Object name : arr) {
            System.out.println(name);
        }

    }
}
