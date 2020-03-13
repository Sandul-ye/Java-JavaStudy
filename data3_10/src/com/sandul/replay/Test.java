package com.sandul.replay;

public class Test {
    public static void main(String[] args) {
        Demo01 d = new Demo01();
        d.run();
        d.jamp();
//        d.sing(); //接口的静态方法只能通过接口名调用
        Jekou.sing();
//        Jekou.jamp(); //接口的默认方法只能通过接口的实现类对象调用
    }
}
