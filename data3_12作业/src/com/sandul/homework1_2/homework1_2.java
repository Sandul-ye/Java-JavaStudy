package com.sandul.homework1_2;

import java.util.HashMap;

public class homework1_2 {
    public static void main(String[] args) {
        /**
         * 有以下字符串：
         * 		String str = “fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew”;
         * 	请编程统计每个字符出现的次数
         */
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
