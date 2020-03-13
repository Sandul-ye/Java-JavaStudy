package com.sandul.bigintegerClass;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("1598746321456987536");
        System.out.println(b1.add(new BigInteger("32465465165432462165432")));
        int num = 10;
        String na =  String.valueOf(num);
        System.out.println(na);

        int num1 = Integer.parseInt("15");
        System.out.println(num1);
    }
}
