package com.maximum.StringDemo;

public class Compare {
    public static void main(String[] args) {
        /*String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);*/ // true

        /*String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);*/ // false

        String s1 = new String("abc");
        String s2 = "Abc";

        //比较字符串对象中的内容是否相等
        boolean result1 = s1.equals(s2);
        System.out.println(result1);

        //比较字符串对象中的内容是否相等，忽略大小写
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);
    }
}
