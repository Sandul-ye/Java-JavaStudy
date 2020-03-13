package com.sandul.homework1_1;

public class TestPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone("摩托罗拉","黑色",6000);
        Phone p2 = new Phone("苹果","金色",9000);
        p1.show();
        System.out.println("==========");
        p2.show();
    }
}
