package com.sandul.data3_5.systemOfHero;

public class Test {
    public static void main(String[] args) {
        ZKui zhong = new ZKui("钟馗",2000,200,20,25);
        HouYi HY = new HouYi("后羿",1000,150,30,15);
        System.out.println(zhong.getHP());
        System.out.println(HY.getHP());
        zhong.skill1(HY);
        System.out.println(zhong.getHP());
        System.out.println(HY.getHP());
    }
}
