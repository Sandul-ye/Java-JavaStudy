package com.sandul.review;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Person.work w = p.new work();//外部类的实例对象创建内部类实例对象
        Person.work w1 = new Person().new work();//外部类类名方式创建内部类实例对象
        p.new work(){
            public void fun(){
                System.out.println("我是内部类！");
            }
        }.fun();
        new Head(){
            @Override
            public void fun() {
                System.out.println("我是Head类的子类对象中的fun方法");
            }
        }.fun();
    }
}
