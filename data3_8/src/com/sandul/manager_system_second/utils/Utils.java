package com.sandul.manager_system_second.utils;

import com.sandul.manager_system_second.domain.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Utils {
    public static int stuID;
    public static int teaID;

    static {
        stuID = 0;
        teaID = 0;
    }

    public static int birthToAge(String birth){
        //把输入的生日转换成年龄
        Date birthDate = null;//生日日期
        try {
            birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;//如果出现异常就返回-1
        }
        Calendar cal = GregorianCalendar.getInstance();//当前日期
        //取出当前日期的年月日
        int nowYear = cal.get(Calendar.YEAR);
        int nowMonth = cal.get(Calendar.MONTH);
        int nowDay = cal.get(Calendar.DAY_OF_MONTH);
        //判断当前时间是否早于参数时间
        if (cal.before(birthDate)) {
            System.out.println("输入的生日日期不合法!");
            return -1;
        }
        //设置生日日期
        cal.setTime(birthDate);
        //读取生日日期的年月日
        int birthYear = cal.get(Calendar.YEAR);
        int birthMonth = cal.get(Calendar.MONTH);
        int birthDay = cal.get(Calendar.DAY_OF_MONTH);
        int age = nowYear - birthYear;
        if (nowMonth <= birthMonth) {
            if (nowMonth == birthMonth) {
                if (nowDay < birthDay) {
                    age--;
                } else {
                    age--;
                }
            }
        }
        return age;
    }
    public static void printPerson(Person person){
        System.out.println("*******************************************");
        System.out.println("编号(ID)\t\t姓名\t\t性别\t\t生日\t\t年龄\t\t描述");
        System.out.println(person);
        System.out.println("*******************************************");

    }
    public static void printArrayList(ArrayList<? extends Person> arrayList){

        System.out.println("*******************************************");
        System.out.println("编号(ID)\t\t姓名\t\t性别\t\t生日\t\t年龄\t\t描述");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("*******************************************");
    }
}

