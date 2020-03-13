package com.sandul.homework2_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test2_1 {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<String>();
        ((ArrayList<String>) arr).add("JavaEE企业级开发指南");
        ((ArrayList<String>) arr).add("Oracle高级编程");
        ((ArrayList<String>) arr).add("MySQL从入门到精通");
        ((ArrayList<String>) arr).add("Java架构师之路");
//        for (String name : arr) {
//            System.out.println(name);
//        }
        Iterator<String> arri = arr.iterator();
        while (arri.hasNext()){
            System.out.println(arri.next());
        }
        System.out.println("*****************");
//
//        for (String name : arr) {
//            if (name.length() < 10) {
//                System.out.println(name);
//            }
//        }
        Iterator<String> arri1 = arr.iterator();
        while (arri1.hasNext()){
            String book1 = arri1.next();
            if (book1.length()<10){
                System.out.println(book1);
            }
        }
        System.out.println("*****************");
//        for (String name : arr) {
//            if (name.contains("Java")) {
//                System.out.println(name);
//            }
//        }
        Iterator<String> arri2 = arr.iterator();
        String book1 = arri2.next();
        while (arri2.hasNext()){
            String book2 = arri2.next();
            if (book2.contains("Java")){
                System.out.println(book2);
            }
        }

        System.out.println("*****************");
        Iterator<String> arri3 = arr.iterator();
        while (arri3.hasNext()){
            String book3 = arri3.next();
            if (book3.contains("Oracle")){
                arri3.remove();
            }else {
                System.out.println(book3);
            }
        }

        System.out.println("*****************");

//
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(((ArrayList<String>) arr).get(i));
        }


    }

}
