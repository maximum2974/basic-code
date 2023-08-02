package com.maximum.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A05_CollectionDemo5 {
    public static void main(String[] args) {
        /*
        迭代器报错注意点:
            1. 报错NoSuchElementException
            2. 迭代器遍历完毕，指针不会复位
            3. 循环中只能使用一次next方法
            4. 迭代器遍历时，不能用集合的方法进行增加或者删除
         */

        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> it = coll.iterator();

        while(it.hasNext()){
            String str = it.next();

            if("bbb".equals(str)){
                //coll.remove("bbb");
                it.remove();
            }
        }
        System.out.println(coll);
    }
}
