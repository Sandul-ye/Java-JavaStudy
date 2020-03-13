package com.sandul.homework5_5;

import java.util.Scanner;

public class Test5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name.charAt(0));
        System.out.println(name.substring(name.indexOf(".")));
        String toLowername = name.toLowerCase();
        char first = toLowername.toUpperCase().charAt(0);
        System.out.println(toLowername.replace(toLowername.charAt(0),first));
    }
}
