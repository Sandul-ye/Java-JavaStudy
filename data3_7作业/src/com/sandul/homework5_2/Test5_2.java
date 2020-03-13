package com.sandul.homework5_2;

import java.util.Scanner;

public class Test5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.endsWith(".java")) {
            System.out.println("此名字是以.java结尾的");
            System.out.println("索引的位置为:"+name.indexOf("."));

            System.out.println(name);
        }else{
            System.out.println("此名字不是以.java结尾的");
        }

    }
}
