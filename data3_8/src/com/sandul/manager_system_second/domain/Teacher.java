package com.sandul.manager_system_second.domain;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(int id, String name, char gender, String birthDay) {
        super(id, name, gender, birthDay);
    }

    @Override
    public String getType() {
        return "教师";
    }

    @Override
    public String getWork() {
        return "讲课";
    }
}
