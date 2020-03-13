package com.sandul.game_system;

public class HouYi extends Hero {
    public HouYi() {
        super("后羿", 800, 100, 20, 10);

    }

    @Override
    public void say() {
        System.out.println(this.getName() + "说：周日被我射熄火了，所以今天是周一！");
    }

    @Override
    public void startFirstAbility() {
        startAnility(new Ability("炙热之风",1.5,10));
    }

    @Override
    public void startSecondAbility() {
        startAnility(new Ability("燎原箭雨",2.0,20));

    }

    @Override
    public void startThirdAbility() {
        startAnility(new Ability("惩戒射击",2.5,30));

    }
}
