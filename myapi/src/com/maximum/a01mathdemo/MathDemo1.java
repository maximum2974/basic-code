package com.maximum.a01mathdemo;

public class MathDemo1 {
    public static void main(String[] args) {
        //abs 获取参数绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        //bug:
        //以int类型为例，取值范围：-2147483648 ~ 2147483647
        //如果没有正数与负数对应，那么传递负数结果有误
        //-2147483648 没有正数与之对应，所以abs结果产生bug
        //System.out.println(Math.abs(-2147483648));

        //ceil 向上取整
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.54));

        //floor 向上取整
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.54));

        //round 四舍五入
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));

        //max 获取两个整数的较大值
        System.out.println(Math.max(20,30));

        //min 获取两个整数的较小值
        System.out.println(Math.min(20,30));

        //pow 获取a的b次幂
        System.out.println(Math.pow(2,3));
        //细节：
        //如果第二个参数 0 ~ 1之间的小数
        System.out.println(Math.pow(4,0.5));

        //开平方
        System.out.println(Math.sqrt(4));

        //开立方
        System.out.println(Math.cbrt(8));

        System.out.println("------------------------------");
        for (int i = 0; i < 10; i++) {
            //random 随机获取0.0 ~ 1.0的小数
            System.out.println(Math.random());
        }

        System.out.println("-------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.floor(Math.random() * 100) + 1);
            //Math.random()  (0.0,1.0)
            //* 100          (0.0,100.0)
            //floor          去掉了后面的小数
            //+1             (1 100.0]
        }
    }
}
