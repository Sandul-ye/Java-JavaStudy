package com.sandul.demo01_final;

public class Test {
    public static void main(String[] args) {
        Demo_inherit_class d = new Demo_inherit_class();
        Demo_class d1 = new Demo_class();
        Dog dd = new Dog();
        d.func(d1);
        d1.fun1();
        dd.func(d1);
    }
}
