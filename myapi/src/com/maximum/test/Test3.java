package com.maximum.test;

public class Test3 {
    public static void main(String[] args) {
        /*
        有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个
        以后每天猴子都吃当前剩下来的一半，然后再多吃一个
        第10天的时候(还没吃),发现只剩下一个桃子了，请问: 最初总共多少个桃子
         */

        System.out.println(getCount(1));
    }

    public static int getCount(int day){
        if(day <= 0 || day >= 11){
            System.out.println("当前时间错误");
            return -1;
        }

        //递归的出口
        if(day == 10){
            return 1;
        }

        //书写规律
        //每一天的桃子的数量都是后一天数量加1, 乘以2
        return (getCount(day + 1) + 1) * 2;
    }
}
