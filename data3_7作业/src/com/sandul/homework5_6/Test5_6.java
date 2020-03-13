package com.sandul.homework5_6;


import java.util.Scanner;

public class Test5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成员信息:");
        String info = sc.nextLine();
        String[] infoArray = info.trim().split(",");
        Student student = new Student(infoArray[0].trim(), Integer.parseInt(infoArray[1].trim()), infoArray[2].trim().charAt(0));
        System.out.println(student.toString());
    }
}
