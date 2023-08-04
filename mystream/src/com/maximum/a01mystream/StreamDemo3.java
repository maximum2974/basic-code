package com.maximum.a01mystream;

import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {
        //双列集合    无    无法直接使用stream流

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);

        //第一种获取stream流的方法
        hm.keySet().stream().forEach(s -> System.out.println(s));
        //第二种获取stream流的方法
        hm.entrySet().stream().forEach(s -> System.out.println(s));
    }
}
