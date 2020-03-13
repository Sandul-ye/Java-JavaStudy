package com.sandul.homework2_1;

import java.util.Arrays;

public class Test2_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }


            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
