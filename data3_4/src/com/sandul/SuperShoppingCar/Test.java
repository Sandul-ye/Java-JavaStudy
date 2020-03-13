package com.sandul.SuperShoppingCar;

public class Test {
    public static void fun(ShopCars shopCars){
        Apple a = new Apple("苹果","g10001",50);
        Conputer c = new Conputer("电脑","g20001",10000);
        TV tv = new TV("电视机","20002",5000);
        shopCars.addGoods(a);
        shopCars.addGoods(c);
        shopCars.addGoods(tv);
        shopCars.show();
        shopCars.total();

    }
    public static void main(String[] args) {
        ShopCars shopCars = new ShopCars();
        fun(shopCars);
        System.out.println(shopCars.toString());  //打印对象的名字
    }
}
