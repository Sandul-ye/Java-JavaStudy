package com.sandul.homework01;

public class Computer extends EGoods implements Play {
    public Computer() {
    }

    @Override
    public void on() {
        System.out.println("电脑开机只需要按一次电源键");
    }

    @Override
    public void off() {
        System.out.println("电脑关机需要长按电源键");
    }


    @Override
    public void play() {
        System.out.println("玩电脑游戏需要鼠标");
    }
}
