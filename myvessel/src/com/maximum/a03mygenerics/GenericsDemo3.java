package com.maximum.a03mygenerics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1, "aaa", "bbb", "ccc", "ddd");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll2(list2, 1, 2, 3, 4, 5);
        System.out.println(list2);
    }
}
