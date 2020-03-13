package com.sandul.doudizhu;

import java.util.*;

public class DouDiZhu {
    public static void main(String[] args) {
        // 牌的种类
        String [] colors = {"♦","♣","♥","♠"};
        // 牌面值种类
        String [] idcards = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        // 牌面值与花色组合
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        int id = 1;
        for (String idcard : idcards) {
            for (String color : colors) {
                map.put(id,(idcard+color));
                id++;
            }

        }
        //  单独装大小王
        map.put(53,"大joke");
        map.put(54,"小joke");

        //  准备一副牌(1---54)
        ArrayList<Integer> pai = new ArrayList<>();
        for (int i = 1; i < 55; i++) {
            pai.add(i);

        }

        // 洗牌
        Collections.shuffle(pai);
        // 新建三个集合代表三个人
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        // 发牌,留三张底牌
        for (int i = 0; i < pai.size()-3; i++) {
            if (i%3==0){
                player1.add(pai.get(i));
            }else if (i%3==1){
                player2.add(pai.get(i));
            }else if (i%3==2){
                player3.add(pai.get(i));
            }

        }
        //底牌单独添加
        diPai.add(pai.get(53));
        diPai.add(pai.get(52));
        diPai.add(pai.get(51));


        //摆牌

        baiPai(player1);
        baiPai(player2);
        baiPai(player3);
        baiPai(diPai);

        //  打印牌
        printPai(player1,map);
        printPai(player2,map);
        printPai(player3,map);
        printPai(diPai,map);

    }

    public static void printPai(ArrayList<Integer> idcards, HashMap<Integer, String> map) {
        for (Integer idcard : idcards) {
            System.out.print(map.get(idcard)+" ");
        }
        System.out.println();
    }

    public static void baiPai(ArrayList<Integer> idcards) {
        for (int i = 0; i < idcards.size()-1; i++) {
            for (int j = 0; j < idcards.size()-1-i; j++) {
                if (idcards.get(j)>idcards.get(j+1)){
                    int temp=idcards.get(j+1);
                    idcards.set(j+1,idcards.get(j));
                    idcards.set(j,temp);
                }

            }
        }
    }


}
