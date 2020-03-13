package com.sandul.replace;

import java.util.Comparator;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
         treeMap.put("张三",18);
        treeMap.put("赵六",58);
        treeMap.put("王五",48);
        treeMap.put("李四",38);
        treeMap.put("李奇",28);
        System.out.println(treeMap);
        //TreeMap存储自定义类型时,必须重写Comparator方法的比较规则
        TreeMap<Student, String> map1 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.hashCode()-o1.hashCode();
            }
        });
        map1.put(new Student("小明",18),"家住北京");
        map1.put(new Student("小花",36),"家住南京");
        map1.put(new Student("小草",72),"家住东京");
        System.out.println(map1);

    }
}
