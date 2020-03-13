package com.sandul.FamilyGoods;

public class Test {
    public static void main(String[] args) {
        Glasses b = new Glasses("水杯",5,"白色");
        Computers c = new Computers("电脑",20,"黑色");
        System.out.println(b.getName());
        System.out.println(b.getSize());
        System.out.println(b.getColor());
        b.water();
        b.guishu();
        System.out.println(c.getName());
        System.out.println(c.getColor());
        System.out.println(c.getSize());
        c.useElectrict();
        c.guishu();

    }
}
