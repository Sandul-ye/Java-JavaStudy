package com.sandul.game_system;

public class ZhongKui extends Hero {
    public ZhongKui() {
        super("钟馗", 2000, 100, 15, 20);
    }

    @Override
    public void say() {
        System.out.println("长安城管！");
    }

    @Override
    public void startFirstAbility() {
       startAnility(new Ability("屁股重击",2.0,20));
    }

    @Override
    public void startSecondAbility() {
        startAnility(new Ability("追踪神钩",1.5,25));

    }

    @Override
    public void startThirdAbility() {
        startAnility(new Ability("吸心大法",3.0,40));

    }
}
