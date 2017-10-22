package com.javinjunfeng.singleton;

/**
 * @Author javinjunfeng
 * @Date 2017/10/22
 * @Guthub https://github.com/javinjunfeng
 */

/**
 * 单例模式：饿汉式
 */
public class Singleton3 {

    private static Singleton3 singleton3 = new Singleton3();

    private Singleton3(){}

    public static Singleton3 getSingleton3(){
        return singleton3;
    }
}
