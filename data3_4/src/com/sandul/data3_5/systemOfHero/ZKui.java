package com.sandul.data3_5.systemOfHero;

public class ZKui extends Hero {
    public ZKui(String name, int HP, int MP, int attack, int defense) {
        super(name, HP, MP, attack, defense);
    }



    @Override
    public void say() {
        System.out.println("长安城管");
    }

    @Override
    public void skill1(Hero enemy) {
        Skill s1 = new Skill("惊天一屁股",20,2);
        if (hurt(s1)){
            enemy.setHP(enemy.getHP()-(this.getAttack()*s1.getSatk()-enemy.getDefense()));
        }
    }

    @Override
    public void skill2(Hero enemy) {
        Skill s2 = new Skill("钩子",20,1);
        if (hurt(s2)){
            enemy.setHP(enemy.getHP()-(this.getAttack()*s2.getSatk()-enemy.getDefense()));
        }
    }

    @Override
    public void skill3(Hero enemy) {
        Skill s3 = new Skill("吸心大法",40,3);
        if (hurt(s3)){
            enemy.setHP(enemy.getHP()-(this.getAttack()*s3.getSatk()-enemy.getDefense()));
        }
    }
}
