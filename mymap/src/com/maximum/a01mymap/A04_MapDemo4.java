package com.maximum.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A04_MapDemo4 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式

        Map<String, String> m = new HashMap<>();

        m.put("张无忌", "赵敏");
        m.put("郭靖","黄蓉");
        m.put("杨过","小龙女");

        //利用Lambda表达式进行遍历
        m.forEach((key,value) -> System.out.println(key + " = " + value));
    }
}
