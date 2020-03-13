package com.sandul.duotai;

public class Pig extends Animal implements Behavior {
    @Override
    public void run() {
        System.out.println("猪跑得非常慢");
    }

    @Override
    public void cry() {
        System.out.println("我还没有见过猪哭");
    }
}
