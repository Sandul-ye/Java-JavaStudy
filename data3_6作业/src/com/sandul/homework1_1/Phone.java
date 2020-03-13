package com.sandul.homework1_1;

public class Phone {
    private String brand;
    private String color;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Phone() {
    }

    public Phone(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public void show(){
        System.out.println("品牌：" + this.brand);
        System.out.println("颜色：" + this.color);
        System.out.println("价格：" + this.price);
    }
}
