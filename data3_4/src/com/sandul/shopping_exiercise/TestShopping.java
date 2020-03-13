package com.sandul.shopping_exiercise;

public class TestShopping {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("g10000","笔记本",10000.0);
        CellPhone cellPhone = new CellPhone("g10001","手机",5000.0);
        Fruit fruit = new Fruit("g20000","苹果",50.0);
        ShopCar shopCar = new ShopCar();
        shopCar.add_product(laptop);
        shopCar.add_product(cellPhone);
        shopCar.add_product(fruit);
        shopCar.show_products();
//        System.out.println(fruit.getGoods_tpye());
        shopCar.calculate_tatol_price();

    }
}
