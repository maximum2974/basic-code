package com.maximum.a02mylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        /*
    List系列集合的五种遍历方式:
        1. 迭代器
        2. 列表迭代器
        3. 增强for
        4. Lambda表达式
        5. 普通for循环
     */

        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1. 迭代器
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/

        //2.增强for
        for (String s : list) {
            System.out.println(s);
        }

        //Lambda表达式
        list.forEach(s -> System.out.println(s));

        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        //列表迭代器
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引
        //额外添加一个方法: 在遍历的过程中，可以添加元素
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String str = it.next();
            if("bbb".equals(str)){
                it.add("qqq");
            }
            System.out.println(str);
        }
    }
}
