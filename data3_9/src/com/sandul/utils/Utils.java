package com.sandul.utils;

import com.sandul.domain.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Utils {
    public static int sID;
    public static int tID;

    static {
        sID = 0;
        tID = 0;
    }
    public static int birthToAge(String birth){
        //计算年龄的方法
        Calendar cal = Calendar.getInstance();//当前日期
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        Date birthDate;
        //参数给定的日期
        try {
            birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;//如果给定参数不合法,那么方法返回-1
        }
        //判断给定参数的日期是否大于当前日期
        if (cal.before(birthDate)){
            System.out.println("输入的日期来自未来!");
        }
        //设定日期
        cal.setTime(birthDate);//生日日期
        //获取年月日
        int birthYear = cal.get(Calendar.YEAR);
        int birthMonth = cal.get(Calendar.MONTH);
        int birthDay = cal.get(Calendar.DAY_OF_MONTH);
        //计算年龄
        int age = year-birthYear;
        if (month<=birthMonth){     //如果月份小或者等再判断
            if (month==birthMonth){  //月份相等判断日
                if (day<birthDay){
                    age--;
                }
            }else {
                age--;
            }
        }
        return age;


    }

    public static void printPerson(Person person){
        System.out.println("***************************************************");
        System.out.println("ID\t\t姓名\t\t性别\t\t年龄\t\t生日\t\t\t\t描述");
        System.out.println(person);
        System.out.println("***************************************************");

    }
    public static void printArrayList(ArrayList<? extends Person> arrayList){
        System.out.println("***************************************************");
        System.out.println("ID\t\t姓名\t\t性别\t\t年龄\t\t生日\t\t\t\t描述");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("***************************************************");
    }
}
