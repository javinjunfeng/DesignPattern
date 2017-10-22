package com.javinjunfeng.singleton;

/**
 * @Author javinjunfeng
 * @Date 2017/10/22
 * @Guthub https://github.com/javinjunfeng
 */

/**
 * 单例模式：登记式/静态内部类
 */
class Singleton5 {

    private static class SingletonInstance{
        private static final Singleton5 singletonInstance = new Singleton5();
    }

    private Singleton5(){}

    public static final Singleton5 getSingleton5(){
        return SingletonInstance.singletonInstance;
    }
}