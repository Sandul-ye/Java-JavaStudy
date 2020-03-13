package com.sandul.nimingClass;

public class TestDemo {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            /**
             * 创建多态对象狗，使用匿名内部类创建，用抽象类父类变量接收
             */
            @Override
            public void eat() {
                System.out.println("狗狗在吃东西");
            }

            @Override
            public void run() {
                System.out.println("狗狗在急速奔跑");
            }
        };
        dog.eat();
        dog.run();
        Animal cat = new Animal() {
            /**
             * 创建多态对象猫
             */
            @Override
            public void eat() {
                System.out.println("猫咪在吃猫粮");
            }

            @Override
            public void run() {
                System.out.println("猫咪在抓老鼠");
            }
        };
        cat.run();
        cat.eat();
        new Dog(){
            public void run(){
                System.out.println("狗狗叫");
            }
        }.run();

    }
}
