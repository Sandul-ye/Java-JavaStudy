package com.sandul.homework4_2;

public class Student {
    private String name;
    private int age;
    private double tall;
    private boolean married;
    private char gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tall=" + tall +
                ", married=" + married +
                ", gender=" + gender +
                '}';
    }

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

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Student() {
    }

    public Student(String name, int age, double tall, boolean married, char gender) {
        this.name = name;
        this.age = age;
        this.tall = tall;
        this.married = married;
        this.gender = gender;
    }
}
