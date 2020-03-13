package com.sandul.homework5_3;

import java.util.Scanner;

public class Test5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if (text.contains("特朗普")){
            text = text.replace("特朗普","*");
        }
        System.out.println(text);
    }
}
