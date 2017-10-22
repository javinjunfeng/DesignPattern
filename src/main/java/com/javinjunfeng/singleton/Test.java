package com.javinjunfeng.singleton;

/**
 * @Author javinjunfeng
 * @Date 2017/10/22
 * @Guthub https://github.com/javinjunfeng
 */

public class Test {
    public static void main (String[] args){
        testSingleton1();
        testSingleton2();
        testSingleton3();
        testSingleton4();
        testSingleton5();
    }

    public static void testSingleton1(){
        Singleton1 singletonA = Singleton1.getSingleton1();
        Singleton1 singletonB = Singleton1.getSingleton1();
        System.out.println(singletonA.hashCode());
        System.out.println(singletonB.hashCode());
    }
    public static void testSingleton2(){
        Singleton2 singletonA = Singleton2.getSingleton2();
        Singleton2 singletonB = Singleton2.getSingleton2();
        System.out.println(singletonA.hashCode());
        System.out.println(singletonB.hashCode());
    }
    public static void testSingleton3(){
        Singleton3 singletonA = Singleton3.getSingleton3();
        Singleton3 singletonB = Singleton3.getSingleton3();
        System.out.println(singletonA.hashCode());
        System.out.println(singletonB.hashCode());
    }
    public static void testSingleton4(){
        Singleton4 singletonA = Singleton4.getSingleton4();
        Singleton4 singletonB = Singleton4.getSingleton4();
        System.out.println(singletonA.hashCode());
        System.out.println(singletonB.hashCode());
    }
    public static void testSingleton5(){
        Singleton5 singletonA = Singleton5.getSingleton5();
        Singleton5 singletonB = Singleton5.getSingleton5();
        System.out.println(singletonA.hashCode());
        System.out.println(singletonB.hashCode());
    }
}