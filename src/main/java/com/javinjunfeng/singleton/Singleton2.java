package com.javinjunfeng.singleton;

/**
 * @Author javinjunfeng
 * @Date 2017/10/22
 * @Guthub https://github.com/javinjunfeng
 */

/**
 * 单例模式：懒汉式，线程安全
 */
public class Singleton2 {

    private static Singleton2 singleton2 = null;

    private Singleton2(){}

    public static synchronized Singleton2 getSingleton2(){
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}
