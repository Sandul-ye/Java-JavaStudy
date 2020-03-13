package com.sandul.homework3_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class homework3_2 {
    public static void main(String[] args) {
        LinkedList<Integer> numf = new LinkedList<>();
        for (int i = 1; i <= 33; i++) {
            numf.add(i);
        }
        HashSet<Integer> numl = new HashSet<>();
        Random ran = new Random();
        int ge = 0;
        int index ;
        while (ge<6){
            index= ran.nextInt(33);
            if (numl.add(numf.get(index))){
                ge++;
            }
        }

        for (Integer num : numl) {
            System.out.print(num+"  ");
        }
        System.out.println("+ "+(ran.nextInt(16)+1));
    }
}
