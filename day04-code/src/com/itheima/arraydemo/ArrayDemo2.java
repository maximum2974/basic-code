package com.itheima.arraydemo;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {5,6,8,0,24,8,54,36,85};
        //在java当中，关于数组的一个长度属性，length
        //调用方式：数组名.length
        System.out.println(arr.length);
        //扩展
        //自动的快速生成数组的遍历方式
        //idea提供的
        //数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
        //遍历数组，Java标准库提供了Arrays.toString()直接打印数组
        System.out.println(Arrays.toString(arr));//[5,6,8,0,24,8,54,36,85]
    }
}
