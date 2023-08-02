package com.maximum.a04mycollection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        /*
        public static <T> boolean addAll(Collection<T> c, T... elements)  批量添加元素
        public static void shuffle(List<?> list)                          打乱List集合元素的顺序
        */

        //addAll
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc","def","hij");
        System.out.println(list);

        //shuffle
        Collections.shuffle(list);
        System.out.println(list);
    }
}
