package com.maximum.StringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //容量：最多装多少
        //长度：已经装了多少
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0

        sb.append("abcdefghigklmnopqrstuvwxyz");
        System.out.println(sb.capacity());//16*2+2=34
        System.out.println(sb.length());//26

    }
}
