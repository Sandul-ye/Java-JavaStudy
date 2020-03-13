package com.sandul.demo01_final;

public final class Demo_class { // 此类不能被继承
    final int a = 10; // 此变量a不能被重新赋值
    public final void func(){   // 此方法不能被重写
        System.out.println("这是被final修饰的类");
    }
    public void fun1(){
        System.out.println("这是没有被final修饰的方法");
    }

}
