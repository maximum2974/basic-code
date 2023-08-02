package com.maximum.StringDemo;

public class StringDemo6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        String result = arrToString(arr);
        System.out.println(result);
    }
    public static String arrToString(int[] arr){
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                result += arr[i];
            }else{
                result += arr[i] + ", ";
            }
        }
        result = result + "]";
        return result;
    }
}
