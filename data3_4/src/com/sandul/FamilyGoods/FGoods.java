package com.sandul.FamilyGoods;

public class FGoods {
    private String name;
    private int size;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FGoods() {
    }

    public FGoods(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }
}
