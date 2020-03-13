package com.sandul.domain;

public class Teacher extends Person {
    public Teacher(int id, String name, char gender, String birthDate) {
        super(id, name, gender, birthDate);
    }

    public Teacher() {
    }

    @Override
    public String getType() {
        return "老师!";
    }

    @Override
    public String getWork() {
        return "教书育人!";
    }
}
