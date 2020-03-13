package com.sandul.demo01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(); //创建学生类的实例对象
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.eat();
        s1.sleep();
        Teacher t1 = new Teacher(); //创建老师类的实例对象
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.salary);
        t1.eat();
        t1.sleep();
        BanZhuRen b = new BanZhuRen();  //创建班主任实例对象
        System.out.println(b.name);
        System.out.println(b.age);
        b.eat();
        b.sleep();

    }
}
