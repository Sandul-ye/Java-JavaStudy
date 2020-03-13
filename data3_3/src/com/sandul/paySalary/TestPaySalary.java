package com.sandul.paySalary;

public class TestPaySalary {
    public static void main(String[] args) {
        Compeny c = new Compeny();
        Coder co = new Coder();
        Manager m = new Manager();
        co.setName("李小亮");
        m.setName("张小强");
        c.paymoney(co);
        c.paymoney(m);



    }
}
