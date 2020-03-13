package com.sandul.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork05 {
    public static void main(String[] args) {
        HashMap<Integer, Student> mapb = new HashMap<>();
        HashMap<String, Map> mapg = new HashMap<>();
        mapg.put("一年级",mapb);
        Student lili = new Student(1, "lili", 60);
        Student lucy = new Student(2, "lucy", 70);
        mapb.put(lili.getId(),lili);
        mapb.put(lucy.getId(),lucy);
        Set<Map.Entry<String, Map>> entries = mapg.entrySet();
        for (Map.Entry<String, Map> entry : entries) {
            System.out.println(entry.getKey()+":");
            Set keys = entry.getValue().keySet();
            for (Object key : keys) {
                System.out.println(entry.getValue().get(key));
            }
        }
    }
}
