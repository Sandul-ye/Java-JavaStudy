package com.sandul.homework3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class homework3_1 {
    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>();
        Collections.addAll(arr, 'a','f','b','c','a','d');

        HashSet<Character> arrSet = new HashSet<>();
        for (Character a : arr) {
            arrSet.add(a);
        }
        System.out.println(arrSet.toString());
    }
}
