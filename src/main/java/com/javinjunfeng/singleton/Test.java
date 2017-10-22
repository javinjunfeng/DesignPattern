package com.javinjunfeng.singleton;

/**
 * Created by katarina on 2017/10/20.
 */
public class Test {
    public static void main (String[] args){
        testSingleton1();
    }

    public static void testSingleton1(){
        Singleton1 singletonA = Singleton1.getSingleton1();
        Singleton1 singletonB = Singleton1.getSingleton1();
        System.out.println(singletonA.hashCode());
        System.out.println(singletonB.hashCode());
    }
}
