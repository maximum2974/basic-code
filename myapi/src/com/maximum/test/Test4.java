package com.maximum.test;

public class Test4 {
    public static void main(String[] args) {
        /*
        小明喜欢爬楼梯，他有的时候一次爬一个楼梯，有的时候一次爬两个楼梯
        如果这个楼梯有100个台阶，小明一共有多少种爬法呢?
         */

        System.out.println(getCount(100));
    }

    public static int getCount(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return getCount(n - 1) + getCount(n - 2);
    }
}
