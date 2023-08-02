package com.maximum.a02mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class A01_TreeMapDemo1 {
    public static void main(String[] args) {
        /*
        TreeMap集合: 基本应用
            需求1:
                键: 整数表示id
                值: 字符串表示商品名称
                要求: 按照id的升序排列、按照id的降序排列
         */

        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:当前要添加的元素
                //o2:表示已经在红黑树中存在的元素
                return o2 - o1;
            }
        });

        tm.put(1,"奥利奥");
        tm.put(2,"康师傅");
        tm.put(3,"九个核桃");
        tm.put(4,"雪碧");
        tm.put(5,"可口可乐");

        System.out.println(tm);
    }
}
