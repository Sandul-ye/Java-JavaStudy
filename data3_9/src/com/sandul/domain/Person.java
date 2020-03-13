package com.sandul.domain;

import com.sandul.utils.Utils;

public abstract class Person {
    private int id;
    private String name;
    private char gender;
    private String birthDate;
    private int age;

    public Person(int id, String name, char gender, String birthDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return this.getId()+
                "\t\t" + name+
                "\t\t" + gender + "\t\t\t" +
                Utils.birthToAge(birthDate) + "\t\t\t" +birthDate+
                "\t\t" +"我是一名:"+this.getType() +
                "我的职责是:"+this.getWork();
    }

    public abstract String getWork();
    public abstract String getType();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
