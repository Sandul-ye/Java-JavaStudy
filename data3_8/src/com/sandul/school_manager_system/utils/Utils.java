package com.sandul.school_manager_system.utils;

import com.sandul.school_manager_system.bisic_class.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utils {
    public static int stuId; // 学生ID由此加一产生;
    public static int teaId;  // 教师ID由此加一产生;

    static {
        stuId = 0;//初始值为0
        teaId = 0;//初始值为0
    }


    public static int getAge(String birth) {
        Calendar nowTime = GregorianCalendar.getInstance(); //获取当前日期
        int year = nowTime.get(Calendar.YEAR);
        int month = nowTime.get(Calendar.MONTH);
        int day = nowTime.get(Calendar.DAY_OF_MONTH);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = null; // 生日日期
        try {
            birthDate = sdf.parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
        if (nowTime.before(birthDate)) {
            System.out.println("你输入的出生日期有误!");
            return -1;
        }
        nowTime.setTime(birthDate); //设置生日日期
        //获取生日的年月日
        int birthYear = nowTime.get(Calendar.YEAR);
        int birthMonth = nowTime.get(Calendar.MONTH);
        int birthDay = nowTime.get(Calendar.DAY_OF_MONTH);
        int age = year - birthYear;
        if (birthMonth <= month) {
            if (birthMonth == month) {
                if (birthDay < day) {
                    age--;
                }
            } else {
                age--;
            }
        }
        return age;


    }

    public static void printPerson(Person person) {
        System.out.println("*******************************************************");
        System.out.println("编号\t\t姓名\t\t年龄\t\t性别\t\t生日\t\t描述");
        System.out.println(person);
        System.out.println("*******************************************************");


    }

    public static void printArrayList(ArrayList arrayList) {
        System.out.println("*******************************************************");
        System.out.println("编号\t\t姓名\t\t年龄\t\t性别\t\t生日\t\t描述");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("*******************************************************");
    }
}
