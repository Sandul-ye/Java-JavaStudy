package com.sandul.homework2_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个生日,格式为:yyyy-MM-dd");
        String input = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date input_sdf = sdf.parse(input); // 把输入的生日字符串解析成为Date类型(相对于基准时间的毫秒值)

        if (input_sdf.getTime()>System.currentTimeMillis()){  //判断输入日期是否早于当前日期
            System.out.println("生日必须早于当前日期!");
        }else{

            Date d = new Date();
            long days = (d.getTime() - input_sdf.getTime())/(1000*60*60*24);
            System.out.println("他来到世界:"  + days+"天");
        }



    }

}
