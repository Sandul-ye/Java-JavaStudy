package com.sandul.homework1_2;

public class Student {
    private String name;
    private String gender;
    private int age;
    private double core;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCore() {
        return core;
    }

    public void setCore(double core) {
        this.core = core;
    }

    public Student() {
    }

    public Student(String name, String gender, int age, double core) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.core = core;
    }
}
