package com.sandul.demo02_static;

public class Demo01_static {
    static int num = 10;
    int bnum = 20;
    public static void fun1(){
//        System.out.println(bnum);  报错，静态方法不能访问非静态成员变量，因为静态方法比非静态成员变量先创建
        System.out.println(num);
        System.out.println("我是静态方法");
    }
    public void fun2(){
        System.out.println(bnum);   //可以，因为非静态成员方法比静态成员变量后出现，所以可以使用
        System.out.println(num);
        System.out.println("我是非静态方法");
    }
}
