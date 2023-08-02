package com.maximum.a03mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型的时候，集合如何存储数据
        //结论:
        //如果我们没有给集合指定类型，默认认为所有的数据类型都是Object类型
        //此时可以往集合添加任意的数据类型
        //弊端: 我们在获取数据的时候，无法使用他的特有行为

        //推出了泛型，可以在添加数据的时候把类型就行统一

        ArrayList<String> list = new ArrayList<>();
        //list.add(123);
        list.add("aaa");
        //list.add(new Student("zhangsan",123));

        //遍历集合
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            //多态的弊端是不能访问子类的特有功能
            //str.length();
            System.out.println(str);
        }
    }
}
