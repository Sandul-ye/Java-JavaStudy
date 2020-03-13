package com.sandul.homework3_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test3_2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Calendar calendar = GregorianCalendar.getInstance();
//        Date day = sdf.parse("1949年10月1日");
//        calendar.set(Calendar.DATE,1949);
//        calendar.set(Calendar.MONTH,10);
//        calendar.set(Calendar.DAY_OF_MONTH,1);
        calendar.set(1949,9,1);
        System.out.println(calendar.DAY_OF_WEEK);


    }
}
