package com.sandul.FamilyGoods;

public class Glasses extends FGoods implements Guishu{
    public Glasses() {
    }

    public Glasses(String name, int size, String color) {
        super(name, size, color);
    }

    public void water(){
        System.out.println("杯子可以乘水喝");
    }

    @Override
    public void guishu() {
        System.out.println("归属家庭用品");
    }
}
