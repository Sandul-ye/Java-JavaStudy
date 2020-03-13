package com.sandul.homework2_3;


import java.text.SimpleDateFormat;

public class CurrentTime {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(sdf.format(System.currentTimeMillis()));
    }
}
