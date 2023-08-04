package com.maximum.a01immutable;

import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        /*
        创建不可变的List集合
        "张三", "李四", "王五", "赵六"
         */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------------------------------------");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("------------------------------------");

        list.forEach(s -> System.out.println(s));
        System.out.println("------------------------------------");


    }
}
