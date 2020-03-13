package com.sandul.shopping_exiercise;

import java.util.ArrayList;

public class ShopCar {
    //购物车类
    //定义集合类成员变量用于存放商品信息
    ArrayList<Product> arr = new ArrayList<Product>();
    //添加物品的方法
    public void add_product(Product product){
        arr.add(product);
        System.out.println("你的物品：" + product.getName() + "——添加成功！");
    }
    //删除商品的方法
    public void del_product(Product product){
        String name = product.getName();
        boolean yorn = arr.remove(product);
        if (yorn){
            System.out.println("你的物品"+ name + "删除成功！");
        }else{
            System.out.println("你所选择的商品不在购物车中！");
        }
    }
    //展示所有商品
    public void show_products(){
        System.out.println("你选购的商品为：");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getId() + "," + arr.get(i).getName() + "," + arr.get(i).getPrice());
        }
    }
    //计算价格
    public void calculate_tatol_price(){
        double total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i).getPrice();

        }
        System.out.println("商品原价价为：" + total);
        double dec_total = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof EGoods){
                dec_total += arr.get(i).getPrice()*0.88;
            }else{
                dec_total += arr.get(i).getPrice();
            }
        }
        System.out.println("折后价为：" + dec_total);
    }

}
