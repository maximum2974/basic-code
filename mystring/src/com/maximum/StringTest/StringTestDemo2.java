package com.maximum.StringTest;

public class StringTestDemo2 {
    public static void main(String[] args) {
        /*给定两个字符串，A和B
        A的旋转操作就是A 最左边的字符移动到最右边
        例如，若A = 'abcde'，在移动一次之后结果就是'bcdea'
        如果在若干次调整操作之后，A能变成B，那么返回true
        如果不能匹配成功，则返回false
         */

        String strA = "abcde";
        String strB = "cdeab";

        boolean result = check(strA,strB);
        System.out.println(result);
    }

    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

    //旋转字符串，把左侧字符移动到右侧字符去
    public static String rotate(String str){
        //1、用subString进行截取，把左边的字符截取出来拼接到右侧去
        //2、可以把字符串先变成一个字符数组，然后调整字符数组里面数据，最后再把字符数组变成字符串

        char[] arr = str.toCharArray();
        char first = arr[0];
        //把剩余的字符依次往前挪一个位置
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        String result = new String(arr);
        return result;

        //截取思路
        /*char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;*/
    }
}
