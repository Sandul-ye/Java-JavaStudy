package com.sandul.homework4_2;

import java.util.Scanner;

public class Test4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] information = new String[5];
        System.out.println("请按顺序输入姓名,年龄,身高,婚否,性别:");
        for (int i = 0; i < 5; i++) {
            information[i] = sc.nextLine();

        }
        Student stu = new Student();
        stu.setName(information[0]);
        stu.setAge(Integer.parseInt(information[1]));
        stu.setTall(Double.parseDouble(information[2]));
        stu.setMarried(Boolean.parseBoolean(information[3]));
        stu.setGender(information[4].charAt(0));
        System.out.println(stu.toString());
    }
}
