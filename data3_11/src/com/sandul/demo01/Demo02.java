package com.sandul.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        List<String> arr = new LinkedList<>();
        Collections.addAll(arr,"张三","李四","王五","刘六");
        System.out.println(arr);

        ((LinkedList<String>) arr).addFirst("sandul");
        System.out.println(arr);
        ((LinkedList<String>) arr).addLast("叶之魂");
        System.out.println(arr);

        ((LinkedList<String>) arr).removeFirst();
        System.out.println(arr);
        ((LinkedList<String>) arr).removeLast();
        System.out.println(arr);
        arr.set(2,"haha");
        System.out.println(arr);
        System.out.println(arr.get(2));
        System.out.println(arr);


    }
}
