package com.sandul.doudizhu01;

import java.util.*;

public class Doudizhu {
    public static void main(String[] args) {
        // 花色
        String [] color = {"♦","♣","♥","♠"};

        // 1-13的牌型
        String [] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //组合牌,因为每张牌都是两部分组成一部分是对应的码值,另一部分是牌面值,所以使用HashMap集合
        HashMap<Integer, String> idcards = new HashMap<>();
        //牌的码值最小为1,大王小王另外加进去
        int index = 1;
        for (String number : numbers) {
            for (String col : color) {
                idcards.put(index,col+number);//逐个添加到集合中
                index++;
            }
        }
        //添加大王小王
        idcards.put(53,"小王");
        idcards.put(54,"大王");
        //1-54一副牌
        ArrayList<Integer> puke = new ArrayList<>();
        for (int i = 1; i < 55; i++) {
            puke.add(i);
        }
        //洗牌shuffle
        Collections.shuffle(puke);
        //创建三个玩家对象和一个底牌对象
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //发牌
        for (int i = 0; i < puke.size()-3; i++) {
            if (i%3==0){
                player1.add(puke.get(i));
            }else if (i%3==1){
                player2.add(puke.get(i));
            }else{
                player3.add(puke.get(i));
            }
        }
        diPai.add(puke.get(puke.size()-3));
        diPai.add(puke.get(puke.size()-2));
        diPai.add(puke.get(puke.size()-1));
        //对牌进行排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);
        //打印牌(对牌进行一一对应)
        printPai(player1,idcards);
        printPai(player2,idcards);
        printPai(player3,idcards);
        printPai(diPai,idcards);
    }

    public static void printPai(ArrayList<Integer> ids, HashMap<Integer, String> idcards) {
        for (Integer num : ids) {
            System.out.print(idcards.get(num) + "   ");
        }
        System.out.println();
    }
}
