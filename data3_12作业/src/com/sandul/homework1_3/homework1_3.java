package com.sandul.homework1_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class homework1_3 {
    public static void main(String[] args) {
        // 花色
        String [] colors = {"♦","♣","♥","♠"};
        // 牌面值
        String [] ids = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //拼接牌
        HashMap<Integer, String> idcards = new HashMap<>();
        int index = 1;
        for (String id:ids) {
            for (String color : colors) {
                idcards.put(index,id+color);
                index++;
            }
        }
        //加入大小王
        idcards.put(53,"小王");
        idcards.put(54,"大王");
        //造一副牌
        ArrayList<Integer> pai = new ArrayList<>();
        for (int i = 1; i < 55; i++) {
            pai.add(i);
        }
        //洗牌
        Collections.shuffle(pai);
        //new三个玩家和一个底牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //发牌
        for (int i = 0; i < pai.size()-3; i++) {
            if (i%3==0){
                player1.add(pai.get(i));
            }else if (i%3==1){
                player2.add(pai.get(i));
            }else{
                player3.add(pai.get(i));
            }
        }
        //底牌
        diPai.add(pai.get(pai.size()-1));
        diPai.add(pai.get(pai.size()-2));
        diPai.add(pai.get(pai.size()-3));
        //对牌进行排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);
        //打印牌
        printPai(player1,idcards);
        printPai(player2,idcards);
        printPai(player3,idcards);
        printPai(diPai,idcards);
    }

    public static void printPai(ArrayList<Integer> cards, HashMap<Integer, String> idcards) {
        for (Integer card : cards) {

            System.out.print(idcards.get(card)+" ");
        }

        System.out.println();

    }
}
