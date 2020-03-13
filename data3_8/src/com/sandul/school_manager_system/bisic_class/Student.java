package com.sandul.school_manager_system.bisic_class;

public class Student extends Person {
    public Student(int id, String name, char gender, String birth) {
        super(id, name, gender, birth);
    }

    public Student() {
    }

    @Override
    public String getType() {
        //返回自己的职业
        return "学生";
    }

    @Override
    public String getWork() {
        return "学习";
    }
}
