package com.sandul.homework01;

public abstract class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Animal(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private String sex;
    public void eat(){
        System.out.println("动物在吃饭");
    }
    public abstract void catchMouse();
}
