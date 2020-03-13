package com.sandul.demoObject;

public class DemotoString {
    private String name;
    private int age;

    public DemotoString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemotoString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
