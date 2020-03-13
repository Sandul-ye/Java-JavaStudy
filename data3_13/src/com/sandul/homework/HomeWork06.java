package com.sandul.homework;

import java.util.*;

public class HomeWork06 {
    public static void main(String[] args) {
        /**
         * 	 对给定的数字列表进行分组，要求返回的Map中，Key为数字，Value为该数字出现的列表。
         * 	 例如，输入的数字列表为：[1,2,3,3,4,2]，
         * 	 那么返回值应为：{1=[1],2=[2,2],3=[3,3],4=[4]}
         */
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,1,2,3,3,4,2);
        System.out.println(classify(arr));


    }
    public static Map<Integer, List<Integer>> classify(Collection<Integer> numbers){
        // 定義一个Map集合，用于保存需要返回的数据
        Map<Integer,List<Integer>> map = new HashMap<>();
        //定义一个List类型的变量
        //TODO在这里补足代码
        ArrayList<Integer> ch = new ArrayList<>();
        for (Integer number : numbers) {
            if (map.containsKey(number)) {
                map.get(number).add(number);

            }else {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(number);
                map.put(number,arr);
            }
        }

        return map;
    }
}
