package com.sandul.replace;

import java.util.HashMap;
import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串:");
        String input = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            }else {
                map.put(input.charAt(i),1);
            }
        }
        System.out.println(map);

    }
}
