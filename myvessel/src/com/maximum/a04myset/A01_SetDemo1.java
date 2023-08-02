package com.maximum.a04myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01_SetDemo1 {
    public static void main(String[] args) {
        /*
        利用Set系列集合，添加字符串，并使用多种方式遍历
            迭代器
            增强for
            Lambda表达式
         */

        Set<String> s = new HashSet<>();

        s.add("张三");
        s.add("李四");
        s.add("王五");

        //迭代器遍历
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        //增强for
        for (String str : s) {
            System.out.println(str);
        }

        //Lambda表达式
        s.forEach(str -> System.out.println(str));
    }
}
