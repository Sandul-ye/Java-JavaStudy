package com.sandul.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork02 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("刘岩",2100);
        map.put("张亮",1700);
        map.put("诸葛亮",1800);
        map.put("灭绝师太",2600);
        map.put("东方不败",3800);
        map.put("刘岩",map.get("刘岩")+300);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
