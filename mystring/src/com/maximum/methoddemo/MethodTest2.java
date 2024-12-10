package com.maximum.methoddemo;

public class MethodTest2 {
    public static void main(String[] args) {
        int number = 12345;
        int temp = number;
        int count = 0;
        while(number != 0){
            number = number / 10;
            count++;
        }
        int[] arr = new int[count];
        int index = arr.length - 1;
        while(temp != 0){
            int m = temp % 10;
            temp = temp / 10;
            arr[index] = m;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
