package com.maximum.a02interfacedemo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建实现类对象并调用方法
        InterImpl ii = new InterImpl();
        ii.method();

        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
