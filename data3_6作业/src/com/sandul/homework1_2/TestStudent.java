package com.sandul.homework1_2;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("小明","男",18);
        Student s2 = new Student("小芳","女",17);
        System.out.println("s1和s2的属性值是否都相等?:" + s1.equals(s2));
        Student s3 = new Student("小明","男",18);
        System.out.println("s1和s3的属性值是否都相等?:" + s1.equals(s3));

    }

}
