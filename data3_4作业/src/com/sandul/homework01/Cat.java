package com.sandul.homework01;

public class Cat extends Animal {
    public Cat(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void catchMouse(){
        System.out.println("猫抓抓老鼠");
    }
}
