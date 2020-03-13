package com.sandul.homework1_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class homework1_1 {
    public static void main(String[] args) {
        HashMap<Integer,String> arr = new HashMap<>();

        arr.put(1,"张三");
        arr.put(2,"李四");
        arr.put(1,"王五");
        System.out.println(arr.size());
        System.out.println("使用“键找值”的方式遍历集合，打印键和值");
        Set<Integer> keys = arr.keySet();
        for (Integer key : keys) {
            System.out.println(key+"="+arr.get(key));
        }
        System.out.println("使用“键值对”的方式遍历集合，打印键和值");
        Set<Map.Entry<Integer, String>> entries = arr.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println(arr.get(1));
        System.out.println(arr.get(10));
        System.out.println("集合中是否有键:10  "+ arr.containsKey(10));
        arr.remove(1);
        System.out.println(arr);
    }
}
