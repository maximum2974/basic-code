package com.maximum.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1、创建集合的对象
        //泛型：限定集合中存储数据的类型
        //ArrayList<String> list = new ArrayList<String>();
        //JDK7

        //此时我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
        //这个类在底层做了一些处理
        //打印对象不是地址值，而是集合中存储数据内容
        //在展示的时候会拿[]把所有的数据进行包裹
        ArrayList<String> list = new ArrayList<>();
        //1、添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        //2、删除元素
        /*list.remove("aaa");
        System.out.println(list);*/
        String str = list.remove(2);
        System.out.println(list);

        //3、修改元素
        String result = list.set(1, "ddd");
        System.out.println(result);
        System.out.println(list);

        //4、查询元素
        String s = list.get(0);
        System.out.println(s);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            String str1 = list.get(i);
            System.out.print(str1 + " ");
        }
    }
}
