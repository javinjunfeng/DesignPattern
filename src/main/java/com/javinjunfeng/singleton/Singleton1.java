package com.javinjunfeng.singleton;

/**
 *@Author 张峻峰 【github.com/javinjunfeng】
 *@Date 2017/10/20 16:22
 */


public class Singleton1 {
    private static Singleton1 singleton1 = null;
    private Singleton1(){}
    public static Singleton1 getSingleton1(){
        if (singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
