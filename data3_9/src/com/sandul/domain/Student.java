package com.sandul.domain;

public class Student extends Person {
    public Student() {
    }

    public Student(int id, String name, char gender, String birthDate) {
        super(id, name, gender, birthDate);
    }

    @Override
    public String getType() {
        return "学生!";
    }

    @Override
    public String getWork() {
        return "学习知识!";
    }
}
