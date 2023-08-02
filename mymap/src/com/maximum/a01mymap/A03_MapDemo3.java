package com.maximum.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式

        Map<String, String> m = new HashMap<>();

        m.put("张无忌", "赵敏");
        m.put("郭靖","黄蓉");
        m.put("杨过","小龙女");

        //通过键值对对象进行遍历
        //通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entries = m.entrySet();
        //遍历entries这个集合，得到里面的每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //利用entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        //迭代器进行遍历
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        //Lambda表达式
        entries.forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> entry) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        });
    }
}
