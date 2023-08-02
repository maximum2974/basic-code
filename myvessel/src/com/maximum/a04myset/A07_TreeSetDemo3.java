package com.maximum.a04myset;

import java.util.TreeSet;

public class A07_TreeSetDemo3 {
    public static void main(String[] args) {
        /*
        需求: 请自行选择比较器排序和自然排序两种方式
        要求: 存入四个字符串，"c" , "ab" , "df" , "qwer"
        按照长度排序, 如果一样长则按照首字母排序

        采取第二种排序方式: 比较器排序
         */

        TreeSet<String> ts = new TreeSet<>((o1,o2) -> {
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }

}
