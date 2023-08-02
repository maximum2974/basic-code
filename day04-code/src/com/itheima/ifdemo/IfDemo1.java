package com.itheima.ifdemo;

public class IfDemo1 {
    public static void main(String[] args) {
        boolean flag = false;
        //注释
        if(flag = true){
            System.out.println("flag的值为true");
        }
        //两种表示方法
        if(flag == true){
            System.out.println("flag的值为true");
        }
        if(flag){
            System.out.println("flag的值为true");
        }
    }
}
