package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
        //先获取一个随机数
        //范围: 1~100
        //1、导包
        //2、创建对象
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        //3、生成随机数
        //判断技巧
        //在小括号中，书写的是生成随机数的范围
        //这个范围一定是从0开始的
        //到这个数-1结束
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            if(guessNumber > number){
                System.out.println("猜大了");
            }else if(guessNumber < number){
                System.out.println("小了");
            }else{
                System.out.println("猜中了");
                break;
            }
        }
    }
}
