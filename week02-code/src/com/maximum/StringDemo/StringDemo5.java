package com.maximum.StringDemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                //char类型的变量在参与计算的时候自动类型提升为int 查询ascii码表
                smallCount++;
            }else if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if(c >= '0' && c<= '9'){
                numberCount++;
            }
        }
        System.out.println("小写字母一共有:" + smallCount + "个");
        System.out.println("大写字母一共有:" + bigCount + "个");
        System.out.println("数字字母有:" + numberCount + "个");
    }
}
