package com.sandul.game_system;

public abstract class Hero {
    private String name;//名称
    private int hp; //血量
    private int mp; //魔法值
    private int attack; // 攻击力
    private int defenses; // 防御力

    public Hero(String name, int hp, int mp, int attack, int defenses) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.defenses = defenses;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefenses() {
        return defenses;
    }

    public void setDefenses(int defenses) {
        this.defenses = defenses;
    }
    // 说台词的方法
    public abstract void say();
    // 发动技能具有共同的操作
    public void startAnility(Ability ability){
        //判断魔法值是否够放技能
        int consume = ability.getMpConsume();
        if (this.mp < consume){
            System.out.println("法力值不足，技能释放失败");
        }else{
            this.mp -= consume;
            // 计算伤害，等于攻击力乘以技能加成的倍数
            double sh = ability.getMultiple()*this.attack;
            System.out.println(this.name + "发动技能: " + ability.getName() + ",耗费" + consume+ "点法力值，对敌人造成" + sh + "点攻击！");
        }

    }
    public abstract void startFirstAbility(); // 技能一
    public abstract void startSecondAbility();// 技能二
    public abstract void startThirdAbility();// 技能三
    public class Ability{//技能类
        private String name ;
        private double multiple;
        private int mpConsume;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMultiple() {
            return multiple;
        }

        public void setMultiple(double multiple) {
            this.multiple = multiple;
        }

        public int getMpConsume() {
            return mpConsume;
        }

        public void setMpConsume(int mpConsume) {
            this.mpConsume = mpConsume;
        }

        public Ability(String name, double multiple, int mpConsume) {
            this.name = name;
            this.multiple = multiple;
            this.mpConsume = mpConsume;
        }
    }
}
