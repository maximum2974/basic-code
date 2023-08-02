package com.itheima.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //数组的动态初始化
        //格式：
        //数据类型[] 数组名 = new 数据类型[数组的长度]
        //在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值
        String[] arr = new String[50];
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//打印出来的是默认初始化值null
        //数组默认初始化值的规律
        //整数类型：默认初始化值0
        //小数类型：默认初始化值0.0
        //字符类型：默认初始化值'/u0000' 空格
        //布尔类型：默认初始化值 false
        //引用数据类型：默认初始化值 null
        char a[] = {'h','e','l','l','o'};
        String sChar = new String(a,1,4);
        a[1] = 's';
        System.out.println(sChar);
        /*分配一个新的 String，它包含来自该字符数组参数一个子数组的字符。
        offset 参数狮子数组第一个字符的索引，count 参数指定子数组的长度
        该子数组内容已被赋值，后续对字符数组的修改不会影响新创建的字符串
         */
        //动态初始化：手动指定数组长度，由系统给出默认初始化值
        //只明确元素个数，不明确具体数值，推荐使用动态初始化
        //静态初始化：手动指定数组元素，系统会根据元素个数，计算出数组的长度
        //需求中已经明确了要操作的具体数据，直接静态初始化即可
    }
}
