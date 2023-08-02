package com.maximum.a03mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        /*MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);*/

        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);

        int i = list.get(0);
        System.out.println(i);

        System.out.println(list);
    }
}
