package com.maximum.StringDemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //1、假设我现在键盘录入一个abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str1 = sc.next(); //abc 是new出来的
        String str2 = "abc";
        System.out.println(str1 == str2);

        //结论
        //以后只要想比较字符串的内容，就必须要用String里面的方法

    }
}
