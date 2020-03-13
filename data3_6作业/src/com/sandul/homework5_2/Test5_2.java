package com.sandul.homework5_2;


import java.util.Arrays;

public class Test5_2 {
    public static void main(String[] args) {
        int [] arr = {55,77,0,88,22,44,33};
        int [] arr1 = new int[7];

        System.arraycopy(arr,3,arr1,2,4);
        System.arraycopy(arr,0,arr1,0,2);
        System.out.println(Arrays.toString(arr1));

    }
}
