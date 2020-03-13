package com.sandul.homework5_4;

import java.util.Scanner;

public class Test5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String [] keyAarray = {"特朗普","普京"};
        for (int i = 0; i < keyAarray.length; i++) {
            if (text.contains(keyAarray[i])){
                text = text.replace(keyAarray[i],"*");
            }


        }
        System.out.println(text);
    }
}
