package com.sandul.SuperShoppingCar;

import java.util.ArrayList;

public class ShopCars {
    ArrayList<Goods> arr = new ArrayList<>();
    public void addGoods(Goods goods){
        arr.add(goods);
        System.out.println("物品：" + goods.getName() + "添加成功");
    }
    public void delGoods(Goods goods){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)==goods){
                arr.remove(goods);
                System.out.println("物品：" + goods.getName() + "删除成功");
                return;
            }
        }
    }
    public void show(){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("物品：" + arr.get(i).getName() + " 编号:" + arr.get(i).getId() + "   价格："  + arr.get(i).getPrice());
        }
    }
    public void total(){
        double dtatal = 0;
        double tatal = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)instanceof EGoods){
                dtatal += arr.get(i).getPrice()*0.88;
            }else{
                dtatal += arr.get(i).getPrice();

            }
            tatal += arr.get(i).getPrice();

        }

        System.out.println("商品总价：" + tatal + "元");
        System.out.println("折后价：" + dtatal + "元");
    }
}
