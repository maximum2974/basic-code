package com.maximum.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A06_CollectionDemo6 {
    public static void main(String[] args) {
        /*
        Collection系列集合三种通用的遍历方式:
        1. 迭代器遍历
        2. 增强for遍历
        3. lambda表达式遍历

        增强for格式:
            for(数据类型 变量名: 集合/数组){

            }
         */

        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        for(String s : coll){
            System.out.println(s);
        }
    }
}
