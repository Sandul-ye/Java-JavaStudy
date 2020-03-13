package com.sandul.paySalary;

public class Compeny implements PaySalary {
    private double money = 58900.0;

    public double getMoney() {
        return money;
    }

    @Override
    public void paymoney(Employee emp) {
        this.money -= emp.getSalary();
        System.out.println("给" + emp.getName() + "发工资" + emp.getSalary() + "元，公司剩余：" + this.getMoney() + "元");

    }
}
