package com.sandul.homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork03 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> map = new LinkedHashMap<>();
        Student xiaoming = new Student(1, "小明", 89);
        Student xf = new Student(2, "xf", 86);
        Student xl = new Student(3, "xl", 80);
        map.put(xiaoming.getId(),xiaoming);
        map.put(xf.getId(),xf);
        map.put(xl.getId(),xl);
        Set<Map.Entry<Integer, Student>> entries = map.entrySet();
        for (Map.Entry<Integer, Student> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
