package com.sandul.school_manager_system.bisic_class;

import com.sandul.school_manager_system.utils.Utils;

public abstract class Person {
    private int id; //ID编号
    private String name; // 姓名
    private char gender;  //性别
    private String birth;  // 生日
    private int age;  // 年龄


    public Person(int id, String name, char gender, String birth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }

    public Person() {
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getAge() {
        return age = Utils.getAge(birth);
    }

    @Override
    public String toString() {
        return this.getId() + "\t\t" + this.getName() +
                "\t\t" + Utils.getAge(birth) + "\t\t" +
                this.getGender() + "\t\t" + this.getBirth() + "\t我是一个:" + this.getType() +
                ",我的职责是：" + this.getWork();
    }

    public abstract String getType();

    public abstract String getWork();
}
