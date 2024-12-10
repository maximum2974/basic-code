package com.maximum.methoddemo;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：掌握最简单的方法定义和调用格式

        //调用方法
        playGame();

        getSum(10,20);
    }

    //定义一个方法
    public static void playGame(){
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }

    //带参数方法的调用
    public static void getSum(int num1,int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
}
