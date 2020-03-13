package com.sandul.homework3_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;

public class Test3_1 {
    public static void main(String[] args) {
        Collection<Double> arr = new ArrayList<>();
        arr.add(88.5);
        arr.add(39.2);
        arr.add(77.1);
        arr.add(56.8);
        arr.add(89.0);
        arr.add(99.0);
        arr.add(59.5);
        for (double name :arr) {
            System.out.println(name);
        }
        System.out.println("--------------");
        for (double name :arr) {
            if (name<60)
            System.out.println(name);
        }
        System.out.println("--------------");

        int i = 0;

        double sum = 0;
        for (double name :arr) {
            if (name<60){
                i++;
                sum+=name;
            }
        }
        System.out.println("不及格分数数量:" + i);
        BigDecimal ave = BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(i),2, RoundingMode.HALF_UP);
        System.out.println("平均分:"+ave);
        System.out.println("--------------");

        double big=((ArrayList<Double>) arr).get(0);

        for (double name :
                arr) {
            big = big>name?big:name;
        }
        System.out.println(big);

    }
}
