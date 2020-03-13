package com.sandul.school_manager_system.bisic_class;

public class Teacher extends Person {
    @Override
    public String getType() {
        return "教师";
    }

    public Teacher(int id, String name, char gender, String birth) {
        super(id, name, gender, birth);
    }

    public Teacher() {
    }

    @Override
    public String getWork() {
        return "讲课";
    }
}
