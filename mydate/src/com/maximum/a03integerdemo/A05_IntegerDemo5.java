package com.maximum.a03integerdemo;

import java.util.Scanner;

public class A05_IntegerDemo5 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串: ");
        /*int i = sc.nextInt();
        System.out.println(i);*/

        //弊端:
        //当我们在使用next，nextInt，nextDouble在接收数据的时候，遇到空格，回车，制表符的时候就停止了
        //键盘录入是123 123  那么此时只能接收到空格前面的数据
        //我想要的接收一整行数据
        //约定:
        //统一使用nextLine
        //特点遇到回车才停止
        String line = sc.nextLine();
        System.out.println(line);

        double v = Double.parseDouble(line);
        System.out.println(v + 1);
    }
}
