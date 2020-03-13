package com.sandul.homework;

import java.util.HashMap;
import java.util.Set;

public class HomeWork01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","孙俪");
        map.put("刘德华","刘岩");
        map.put("黄晓明","Baby");
        map.put("谢霆锋","张柏芝");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+"->"+map.get(key));
        }
    }
}
