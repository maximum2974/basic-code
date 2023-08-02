package com.maximum.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args) {
        //使用方法重载思想

        //调用
        compare(10,20);
    }

    //会把相同功能的方法名起成一样的名字
    //好处1：定义方法的时候可以不用那么多单词了
    //好处2：调用方法的时候也不需要那么麻烦了
    public static void compare(byte b1,byte b2){
        System.out.println(b1 == b2);
    }
    public static void compare(short s1,short s2){
        System.out.println(s1 == s2);
    }
    public static void compare(int i1,int i2){
        System.out.println(i1 == i2);
    }
}
