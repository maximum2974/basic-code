package com.maximum.mySet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("john");
        set.add(null);
        System.out.println(set);

        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        System.out.println(treeSet);
    }
}
