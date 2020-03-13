package com.sandul.duotai;

public class Test {
    public static void fun(Behavior an){
        an.run();
        an.cry();


    }
    public static void fun1(Animal an1){
        an1.eat();
        an1.sleep();
    }
    public static void main(String[] args) {
       fun(new Pig());
       fun1(new Dog());
       fun1(new Cat());
    }

}
