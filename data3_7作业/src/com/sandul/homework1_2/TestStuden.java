package com.sandul.homework1_2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class TestStuden {
    public static void main(String[] args) {
        Student stu1 = new Student("张三","男",20,79.5);
        Student stu2 = new Student("李四","女",21,80.2);
        Student stu3 = new Student("王五","男",22,77.9);
        Student stu4 = new Student("周六","男",20,55.8);
        Student stu5 = new Student("赵七","女",21,99.9);
        ArrayList<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);
        BigDecimal sum = new BigDecimal("0.0");
        BigDecimal aver;//平均值
        for (int i = 0; i < 5; i++) {
            BigDecimal bd = new BigDecimal(students.get(i).getCore());
            sum = sum.add(bd);

        }
        aver = sum.divide(new BigDecimal(students.size()),2, RoundingMode.HALF_UP);
        System.out.println("平均分为:"+aver);
    }
}
