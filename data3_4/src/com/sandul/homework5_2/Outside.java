package com.sandul.homework5_2;

public class Outside {
    private int a = 100;
    class Inside{
        private int a = 200;
        public void show(){
            int a = 300;
            System.out.println(new Outside().a);
            System.out.println(new Outside().new Inside().a);
            System.out.println(a);
        }
    }
}
