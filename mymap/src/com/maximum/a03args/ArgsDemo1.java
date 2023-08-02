package com.maximum.a03args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        /*
        假如需要定义一个方法求和，该方法可以灵活的完成如下需求:
        计算2个数据的和
        计算3个数据的和
        计算4个数据的和
        计算n个数据的和
        */

        //JDK5
        //可变参数
        //方法形参的个数是可以发生变化的，0 1 2 3 ······
        //格式: 属性类型...名字
        //int...args
        int sum = getSum(1, 2, 3, 4, 5, 6);
        System.out.println(sum);
    }

    //底层:
    //可变参数底层就是一个数组
    //Java会帮我们创建好
    //细节:
    //1. 在方法的形参中最多只能写一个可变参数
    //2. 在方法当中，如果除了可变参数以外，还有其他的形参，那么可变参数要写在最后
    public static int getSum(int...args){
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
