package com.sandul.manager_system_second.domain;

public class Student extends Person{
    public Student() {
    }

    public Student(int id, String name, char gender, String birthDay) {
        super(id, name, gender, birthDay);
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学习";
    }
}
