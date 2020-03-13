package com.sandul.homework5_1;

import java.util.Scanner;

public class Test5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个Emil地址");
        String emill = sc.nextLine();
        if (emill.contains("@")&&emill.contains(".")) {
            System.out.println("合法");
        }else{
            System.out.println("不合法的Email地址");
        }
    }
}
