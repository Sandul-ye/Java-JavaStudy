package com.sandul.manager_system_second.domain;

import com.sandul.manager_system_second.utils.Utils;

public abstract class Person {
    private int id;
    private String name;
    private char gender;
    private String birthDay;
    private int age;

    public Person() {
    }

    public Person(int id, String name, char gender, String birthDay) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;

    }

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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return Utils.birthToAge(birthDay);
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getId() + "\t\t" +
                this.getName()+ "\t\t"+
                this.getGender()+"\t\t"+
                this.getBirthDay()+"\t\t"+
                Utils.birthToAge(this.getBirthDay())+"\t\t我是一名:"+
                this.getType()+"\t我的职责是:"+this.getWork();
    }
    public abstract String getType();
    public abstract String getWork();
}
