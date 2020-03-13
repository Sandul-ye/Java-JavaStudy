package com.sandul.data3_5;

public class Electrict {
    private String brand;
    private String id ;
    private String color;
    private double price;

    public Electrict() {
    }

    public Electrict(String brand, String id, String color, double price) {
        this.brand = brand;
        this.id = id;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
