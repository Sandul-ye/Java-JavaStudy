package com.sandul.homework5_2;

public class TestHomeWork {
    public static void main(String[] args) {
        Outside o  = new Outside();
        Outside.Inside oo =  o.new Inside();
        oo.show();
        System.out.println("============");
        fun(new Animal() {
            @Override
            public void show() {
                System.out.println("lalgjdas");
            }
        });



    }
    public static void fun(Animal a){
        a.show();
    }
}
