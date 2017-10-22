package com.javinjunfeng.singleton;

/**
 * @Author javinjunfeng
 * @Date 2017/10/22
 * @Guthub https://github.com/javinjunfeng
 */

/**
 * 单例模式：双检锁/双重校验锁
 */
public class Singleton4 {

    private static volatile Singleton4 singleton4 = null;

    private Singleton4(){}

    public static Singleton4 getSingleton4(){
        //  检查实例，如果不存在，就进入同步区
        if (singleton4 == null){
            synchronized (Singleton4.class) {
                //  再检查一次如果仍是null，才创建实例
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}