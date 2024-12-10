package com.maximum.StringBuilder;

//使用StringBuilder的场景
//1、字符串的拼接
//2、字符串的反转

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("我永远热爱2022年的夏天");

        //2、添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //反转
        sb.reverse();

        //获取长度
        int len = sb.length();
        System.out.println(len);

        //普及
        //因为StringBuilder是Java已经写好的类
        //java在底层对他做了一些特殊处理
        //打印对象不是地址值而是属性值
        System.out.println(sb);
    }
}
