package com.sandul.homework3_2;

import java.util.HashSet;

public class homework3_2 {
    public static void main(String[] args) {
        HashSet<Student> arr = new HashSet<>();
        Student s1 = new Student("张三",'男',20);
        Student s2 = new Student("李四",'女',21);
        Student s3 = new Student("张三",'男',20);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        for (Student name : arr) {
            System.out.println(name.toString());
        }
    }
}
