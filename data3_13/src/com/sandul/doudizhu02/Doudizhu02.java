package com.sandul.doudizhu02;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;

public class Doudizhu02 {
    public static void main(String[] args) {
        String[]  colors = {"♦","♣","♥","♠"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        HashMap<Integer, String> map = new HashMap<>();
        int index = 1;
        for (String number : numbers) {
            for (String color : colors) {
                map.put(index,number+color);
                index++;
            }

        }
        map.put(53,"小w");
        map.put(54,"大w");

        ArrayList<Integer> puke2 = new ArrayList<>();
        for (int i = 1; i < 55; i++) {
            puke2.add(i);
        }
        Collections.shuffle(puke2);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < puke2.size()-3; i++) {
            if (i%3==0){
                player1.add(puke2.get(i));
            }else if (i%3==1){
                player2.add(puke2.get(i));
            }else{
                player3.add(puke2.get(i));
            }
        }
        diPai.add(puke2.get(puke2.size()-3));
        diPai.add(puke2.get(puke2.size()-2));
        diPai.add(puke2.get(puke2.size()-1));
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);
        printPuKe(player1,map);
        printPuKe(player2,map);
        printPuKe(player3,map);
        printPuKe(diPai,map);
    }

    public static void printPuKe(ArrayList<Integer> ids, HashMap<Integer, String> map) {
        for (Integer id : ids) {
            System.out.print(map.get(id)+"    ");
        }
        System.out.println();

    }
}
