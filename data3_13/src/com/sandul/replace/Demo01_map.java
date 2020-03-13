package com.sandul.replace;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01_map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三",18);
        map.put("李四",19);
        map.put("王五",28);
        map.put("赵六",38);
        map.put("李七",48);
        System.out.println(map);
        map.remove("张三");
        System.out.println(map);
        map.put("李四",99);
        System.out.println(map);
        int  v1 = map.get("李七");
        System.out.println(v1);
        boolean tf = map.containsKey("赵六");
        System.out.println(tf);
        System.out.println(map.containsValue(28));
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(map.get(key));
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() +"="+entry.getValue());

        }
    }
}
