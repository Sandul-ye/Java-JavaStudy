package com.sandul.FamilyGoods;

public abstract class Electrict extends FGoods {
    public abstract void useElectrict();

    public Electrict() {
    }

    public Electrict(String name, int size, String color) {
        super(name, size, color);
    }
}
