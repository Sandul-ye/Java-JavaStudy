package com.sandul.homework3_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.ZONE_OFFSET;

public class Test3_1 {
    public static void main(String[] args) {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(ZONE_OFFSET,8);

        System.out.print(calendar.get(Calendar.YEAR)+ "年");
        System.out.print(calendar.get(Calendar.MONTH)+"月");
        System.out.print(calendar.get(Calendar.DATE)+"日");
        System.out.print(calendar.get(Calendar.HOUR_OF_DAY)+"时");
        System.out.print(calendar.get(Calendar.MINUTE)+"分");
        System.out.println(calendar.get(Calendar.SECOND)+"秒");
    }
}
