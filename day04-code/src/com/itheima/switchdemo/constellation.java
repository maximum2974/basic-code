package com.itheima.switchdemo;
/*
default的位置和省略
1、位置：default不一定是写在最下面的，我们可以写在任意位置，只不过习惯会写在最下面
2、省略:default可以省略，语法不会有问题，但是不建议省略
 */
import java.util.Scanner;

public class constellation {
    public static void main(String[] args) {
        System.out.println("请输入您的出生年月（如 0123 表示 1 月 23 日）：");
        Scanner sc = new Scanner(System.in);
        int monthday = sc.nextInt();
        int month = monthday/100;
        int day = monthday%100;
        String xingzuo = "";
        switch(month){
            case 1:
                xingzuo = day < 21 ? "魔蝎座" : "水瓶座";
                break;
            case 2:
                xingzuo = day < 20 ? "水瓶座" : "双鱼座";
                break;
            case 3:
                xingzuo = day < 21 ? "双鱼座" : "白羊座";
                break;
            case 4:
                xingzuo = day < 21 ? "白羊座" : "金牛座";
                break;
            case 5:
                xingzuo = day < 22 ? "金牛座" : "双子座";
                break;
            case 6:
                xingzuo = day < 22 ? "双子座" : "巨蟹座";
                break;
            case 7:
                xingzuo = day < 23 ? "巨蟹座" : "狮子座";
                break;
            case 8:
                xingzuo = day < 24 ? "狮子座" : "处女座";
                break;
            case 9:
                xingzuo = day < 24 ? "处女座" : "天枰座";
                break;
            case 10:
                xingzuo = day < 24 ? "天秤座" : "天蝎座";
                break;
            case 11:
                xingzuo = day < 23 ? "天蝎座" : "射手座";
                break;
            case 12:
                xingzuo = day < 22 ? "射手座" : "魔蝎座";
                break;
        }
        System.out.println("您的星座是" +xingzuo);
    }
}
