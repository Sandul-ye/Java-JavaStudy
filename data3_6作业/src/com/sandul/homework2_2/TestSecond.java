package com.sandul.homework2_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestSecond {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个生日(格式为:yyyy-MM-dd):");
        String sr1 = sc.nextLine();
        System.out.println("输入第二个生日(格式为:yyyy-MM-dd):");
        String sr2 = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dsr1 = sdf.parse(sr1);
        Date dsr2 = sdf.parse(sr2);
        System.out.println("第一个生日是否比第二个生日大" + ((dsr1.before(dsr2))?true:false));

    }
}
