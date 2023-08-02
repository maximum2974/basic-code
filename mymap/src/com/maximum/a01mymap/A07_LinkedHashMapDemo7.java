package com.maximum.a01mymap;

import java.util.LinkedHashMap;

public class A07_LinkedHashMapDemo7 {
    public static void main(String[] args) {
        /*
        LinkedHashMap:
            由键决定:
                有序、不重复、无索引
            有序:
                保证存储和取出的顺序一致
            原理:
                底层数据结构依然是哈希表，只是每个键值对元素又额外的多了一个双链表的
                机制记录存储的顺序
         */

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("c", 789);
        lhm.put("a", 123);
        lhm.put("a", 111);
        lhm.put("b", 456);
        System.out.println(lhm);
    }
}
