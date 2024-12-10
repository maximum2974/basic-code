package com.maximum.StringBuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //2、添加字符串
        sb.append("aaa").append("bbb").append("ccc").append("ddd");

        System.out.println(sb);

        //3、再把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
