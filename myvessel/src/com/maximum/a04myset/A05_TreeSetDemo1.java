package com.maximum.a04myset;

import java.util.Iterator;
import java.util.TreeSet;

public class A05_TreeSetDemo1 {
    public static void main(String[] args) {
        /*
        需求: 利用TreeSet存储整数并进行排序
         */

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);

        System.out.println(ts);

        //遍历集合
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }

        for (Integer t : ts) {
            System.out.println(t);
        }

        ts.forEach(i -> System.out.println(i));
    }
}
