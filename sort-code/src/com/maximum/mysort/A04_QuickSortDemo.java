package com.maximum.mysort;

import java.util.Random;

public class A04_QuickSortDemo {
    public static void main(String[] args) {
        /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
        */
        //int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        int[] arr = new int[1000000];

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
    }

    /*
    参数一:我们要排序的数组
    参数二:要排序数组的起始索引
    参数三:要排序数组的结束索引
     */

    public static void quickSort(int[] arr, int i, int j){
        int start = i;
        int end = j;

        if(start > end){
            return;
        }

        int baseNumber = arr[i];
        while(start != end){
            while(true){
                if(end <= start || arr[end] < baseNumber){
                    break;
                }
                end--;
            }

            while(true){
                if(end <= start || arr[start] > baseNumber){
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
