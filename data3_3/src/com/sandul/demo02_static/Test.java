package com.sandul.demo02_static;

public class Test {
    public static void main(String[] args) {
        Demo01_static d = new Demo01_static();
        System.out.println(d.num);
        System.out.println(d.bnum);
        d.fun1();
        d.fun2();
        System.out.println("=============");
        d.num = 188;
        d.bnum = 288;
        Demo01_static dd = new Demo01_static();
        System.out.println(dd.bnum);
        System.out.println(dd.num);
        System.out.println("==========");
        System.out.println(Demo01_static.num);
        Demo01_static.fun1();


    }
}
