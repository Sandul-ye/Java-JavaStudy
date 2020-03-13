package com.sandul.game_system;

public class Test {
    public static void main(String[] args) {
        HouYi houyi = new HouYi();
        ZhongKui zhognkui = new ZhongKui();
        houyi.say();
        houyi.startFirstAbility();
        houyi.startSecondAbility();
        houyi.startThirdAbility();

        zhognkui.say();
        zhognkui.startFirstAbility();
        zhognkui.startSecondAbility();
        zhognkui.startThirdAbility();

    }
}
