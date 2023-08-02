package com.maximum.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        Map<String, String> m = new HashMap<>();

        m.put("张无忌", "赵敏");
        m.put("郭靖","黄蓉");
        m.put("杨过","小龙女");

        //通过键找值

        //获取所有的键，把这些键放到一个单列集合当中
        Set<String> keys = m.keySet();

        //遍历单列集合，得到每一个键

        //增强for循环
        for (String key : keys) {
            //System.out.println(key);
            //利用map集合中的键获取对应的值 get
            String value = m.get(key);
            System.out.println(key + " = " +value);
        }

        //迭代器
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = m.get(key);
            System.out.println(key + " = " + value);
        }

        //Lambda表达式
        m.forEach((key, value) -> System.out.println(key + " = " + value));

    }
}
