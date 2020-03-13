package com.sandul.homework2_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) throws ParseException {
        Date sr1 = inputBirth();
        Date sr2 = inputBirth();
        if (sr1.getTime() > sr2.getTime()) { //转换为距离基础时间的毫秒值作比较
            System.out.println("第一个生日大于第二个生日");
        }else if(sr1.getTime() < sr2.getTime()){
            System.out.println("第一个生日小于第二个生日");

        }else{
            System.out.println("两个生日日期一样大");
        }

    }

    public static Date inputBirth() throws ParseException {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入生日(格式:yyyy年MM月dd日):");
            String birth = sc.nextLine();
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

            if (d.getTime() < sdf.parse(birth).getTime()) {
                System.out.println("生日日期必须早于当前日期!");

            } else {
//                System.out.println(sdf.parse(birth).getTime());
                return sdf.parse(birth);
            }

        }

    }
}
