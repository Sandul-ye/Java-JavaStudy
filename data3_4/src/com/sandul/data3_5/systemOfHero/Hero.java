package com.sandul.data3_5.systemOfHero;

public abstract class Hero {
    private String name;
    private int HP;
    private int MP;
    private int attack;
    private int defense;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Hero(String name, int HP, int MP, int attack, int defense) {
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.attack = attack;
        this.defense = defense;
    }

    public Hero() {
    }
    /**
     * 英雄的功能，三个攻击技能一个说台词的功能；
     */
    public abstract void say();
    public abstract void skill1(Hero enemy);
    public abstract void skill2(Hero enemy);
    public abstract void skill3(Hero enemy);
    public boolean hurt(Skill skill){
        if (HP>=skill.getSmp()){
            this.MP -= skill.getSmp();
            System.out.println("技能发动成功！对敌人造成的伤害为：" + this.getAttack()*skill.getSatk());
            return true;
        }else{
            System.out.println("技能发动失败！");
            return false;
        }

    }
    /**
     * 英雄的技能类抽取，因为技能都是类似的
     */
    class Skill{
        private String name;
        private int smp;
        private int satk;

        public Skill(String name, int smp, int satk) {
            this.name = name;
            this.smp = smp;
            this.satk = satk;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSmp() {
            return smp;
        }

        public void setSmp(int smp) {
            this.smp = smp;
        }

        public int getSatk() {
            return satk;
        }

        public void setSatk(int satk) {
            this.satk = satk;
        }

    }

}
