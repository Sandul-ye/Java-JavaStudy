package com.sandul.replay;

public interface Jekou {
    public abstract void run();
    public static void sing(){
        System.out.println("唱歌");
    }
    public default void jamp(){
        System.out.println("haha");
    }

}
