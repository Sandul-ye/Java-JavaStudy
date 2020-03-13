package com.sandul.homework1_1;

import java.math.BigDecimal;

public class homeWork1_1 {
    public static void main(String[] args) {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
        BigDecimal sum = new BigDecimal("0.0"); //总值
        BigDecimal aver;//平均值
        for (int i = 0; i < arr.length; i++) {
            BigDecimal b1 = new BigDecimal(String.valueOf(arr[i]));
            sum = sum.add(b1);

        }
        aver = sum.divide(new BigDecimal(String.valueOf(arr.length)),2,BigDecimal.ROUND_HALF_UP);
        System.out.println("总值为:"+sum);
        System.out.println("平均值为:"+aver);

    }
}
