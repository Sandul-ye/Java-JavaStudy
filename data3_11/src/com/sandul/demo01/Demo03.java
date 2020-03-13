package com.sandul.demo01;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
        Set<Integer> arr = new LinkedHashSet<>();
        Collections.addAll(arr,1,2,3,4,5,6,7,8,9,10);
        System.out.println(arr);

        Iterator<Integer> num = arr.iterator();
        while (num.hasNext()){
            System.out.println(num.next());
        }
        for (Integer numm : arr) {
            System.out.println(numm);

        }
    }
}
