package com.sandul.FamilyGoods;

public class Computers extends Electrict implements Guishu{
    public Computers() {
    }

    public Computers(String name, int size, String color) {
        super(name, size, color);
    }

    @Override
    public void useElectrict() {
        System.out.println("电脑会消耗电量");
    }

    @Override
    public void guishu() {
        System.out.println("归属家用电器");
    }
}
