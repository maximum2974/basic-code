package com.maximum.a07interfacedemo7;

public class InterImpl implements Inter{

    @Override
    public void method() {
        System.out.println("InterImpl重写的抽象方法");
    }

    public static void show(){
        System.out.println("调用InterImpl的静态方法");
    }
}
