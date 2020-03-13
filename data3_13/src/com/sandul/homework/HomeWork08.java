package com.sandul.homework;

import java.util.HashMap;
import java.util.Scanner;

public class HomeWork08 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("英文字母",0);
        map.put("空格",0);
        map.put("数字",0);
        map.put("其他字符",0);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i)>='a'&&input.charAt(i)<='z')||(input.charAt(i)>='A'&&input.charAt(i)<='Z')){
                map.put("英文字母",map.get("英文字母")+1);
            }else if (input.charAt(i)==' '){
                map.put("空格",map.get("空格")+1);
            }else if (input.charAt(i)>='0'&&input.charAt(i)<='9'){
                map.put("数字",map.get("数字")+1);
            }else {
                map.put("其他字符",map.get("其他字符")+1);
            }

        }
        System.out.println(map);


    }
}
