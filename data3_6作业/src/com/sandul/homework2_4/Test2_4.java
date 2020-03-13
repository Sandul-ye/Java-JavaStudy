package com.sandul.homework2_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2_4 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdfBefore = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfAfter = new SimpleDateFormat("yyyy年MM月dd日");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个日期(yyyy-MM-dd)");
        String inputDate = sc.nextLine();
        Date inputParse = sdfBefore.parse(inputDate);
        System.out.println(sdfAfter.format(inputParse));

    }
}
