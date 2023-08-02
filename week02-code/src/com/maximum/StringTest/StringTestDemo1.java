package com.maximum.StringTest;

import java.util.Scanner;

public class StringTestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(true){
            System.out.println("请输入一个字符串");
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("当前字符串不符合规则，请重新输入");
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - '0';
            String s = changeRoma(number);
            sb.append(s);
        }
        System.out.println(sb);
    }

    public static String changeRoma(int number){
        String[] arr = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return arr[number];
    }

    public static boolean checkStr(String str){
        //要求1：长度小于等于9
        if(str.length() > 9){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
