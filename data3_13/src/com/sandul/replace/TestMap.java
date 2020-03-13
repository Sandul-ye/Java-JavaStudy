package com.sandul.replace;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student nacy = new Student("nacy", 18);
        Student lise = new Student("lise", 28);
        Student sandul = new Student("sandul", 38);
        map.put(nacy,"北京");
        map.put(lise,"南京");
        map.put(sandul,"东京");
        System.out.println(map);
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }


        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey().getName() +":"+entry.getKey().getAge()+"  家庭住址为:"+entry.getValue());
        }
    }
}
