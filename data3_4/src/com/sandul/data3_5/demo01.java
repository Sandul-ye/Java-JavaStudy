package com.sandul.data3_5;

import java.util.Date;

public class demo01 {
    public static void main(String[] args) {
//        System.out.println(new Date());
//        System.out.println(new Date(0L));
//        System.out.println(new Date().getTime());
//        Date d = new Date(1583405306526L);
//        System.out.println(d);
//        System.out.println(Math.ceil(19.36D));
//        System.out.println(Math.floor(19.36D));
//        System.out.println(Math.round(19.36D));
//        System.out.println(Math.abs(-19.36));
//        System.out.println(Math.pow(2,3));
//        System.exit(0);
//
//        System.out.println(System.currentTimeMillis());
          double start = System.currentTimeMillis();;
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
