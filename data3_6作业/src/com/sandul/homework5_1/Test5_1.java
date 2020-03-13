package com.sandul.homework5_1;

import java.util.Arrays;

public class Test5_1 {
    public static void main(String[] args) {
        int [] arr = {10,27,8,5,2,1,3,55,88};
        int [] arr1 = new int[5];
        System.arraycopy(arr,2,arr1,0,5);
        System.out.println(Arrays.toString(arr1));
    }
}
