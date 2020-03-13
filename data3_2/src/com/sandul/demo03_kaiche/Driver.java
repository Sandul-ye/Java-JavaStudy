package com.sandul.demo03_kaiche;

public abstract class Driver {
    public void  func(){
        System.out.println("点火");
        System.out.println("关门");
        kai();
        System.out.println("熄火");
        System.out.println("下车");
        System.out.println("关门");

    }
    public abstract void kai();
}
