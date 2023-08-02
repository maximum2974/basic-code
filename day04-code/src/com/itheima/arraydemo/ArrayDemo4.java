package com.itheima.arraydemo;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //二维数组
        int[][] ns = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(ns.length);// 3
        int[] arr0 = ns[0];
        System.out.println(arr0.length);// 4
        System.out.println(ns[1][2]);// 7
        //打印二维数组，使用两层嵌套循环
        for(int[] arr : ns){
            for(int n : arr){
                System.out.print(n);
                System.out.print(", ");
            }
            System.out.println();
        }
        //或者使用Java标准库的Arrays.deepToString();
        System.out.println(Arrays.deepToString(ns));

        //三维数组
        int[][][] ns2 = {
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                },
                {
                        {10,11},
                        {12,13}
                },
                {
                        {14,15,16},
                        {17,18}
                }
        };
        System.out.println(ns2[2][0][1]); // 15
    }
}
