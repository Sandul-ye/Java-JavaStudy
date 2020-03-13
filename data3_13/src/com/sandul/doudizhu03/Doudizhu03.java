package com.sandul.doudizhu03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Doudizhu03 {
    public static void main(String[] args) {
        String [] colors = {"♦","♣","♥","♠"};
        String [] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        HashMap<Integer, String> map = new HashMap<>();
        int index = 1;
        for (String number : numbers) {
            for (String color : colors) {
                map.put(index,number+color);
                index++;
            }
        }
        map.put(53,"小王");
        map.put(54,"大王");
        ArrayList<Integer> pukepai = new ArrayList<>();
        for (int i = 1; i < 55; i++) {
            pukepai.add(i);
        }
        Collections.shuffle(pukepai);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int i = 0; i < pukepai.size()-3; i++) {
            if (i%3==0){
                player1.add(pukepai.get(i));
            }else if (i%3==1){
                player2.add(pukepai.get(i));
            }else {
                player3.add(pukepai.get(i));
            }
        }
        dipai.add(pukepai.get(pukepai.size()-3));
        dipai.add(pukepai.get(pukepai.size()-2));
        dipai.add(pukepai.get(pukepai.size()-1));
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);
        printPuKePai(player1,map);
        printPuKePai(player2,map);
        printPuKePai(player3,map);
        printPuKePai(dipai,map);


    }

    public static void printPuKePai(ArrayList<Integer> ids, HashMap<Integer, String> map) {
        for (Integer id : ids) {
            System.out.print(map.get(id)+"    ");
        }
        System.out.println();
    }
}
