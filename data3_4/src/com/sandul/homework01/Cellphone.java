package com.sandul.homework01;

public class Cellphone extends EGoods implements Play {
    @Override
    public void on() {
        System.out.println("手机开机需要长按电源键");
    }

    @Override
    public void off() {
        System.out.println("手机关机也需要长按电源键");

    }

    @Override
    public void play() {
        System.out.println("手机游戏只需要点击屏幕");
    }
}
