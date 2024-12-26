package com.maximum.myMap;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class draft {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("小明", 1);
        map1.put("小红", 2);
        map1.put("小张", 3);

        /*for (String key : map1.keySet()) {
            System.out.println("key = " + key);
        }

        for (Integer value : map1.values()) {
            System.out.println("value = " + value);
        }*/

        /*for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.print("key = " + entry.getKey());
            System.out.println(", value = " + entry.getValue());
        }*/

        /*for (String key : map1.keySet()) {
            Integer value = map1.get(key);
            System.out.println("key = " + key);
            System.out.println(", value = " + value);
        }*/

//        Iterator<Map.Entry<String, Integer>> iter = map1.entrySet().iterator();
//        while(iter.hasNext()){
//            Map.Entry<String, Integer> entry = iter.next();
//            System.out.print("key = " + entry.getKey());
//            System.out.println(", value = " + entry.getValue());
//        }

        /*map1.forEach((key, value) -> {
            System.out.print("key = " + key);
            System.out.println(", value = " + value);
        });*/

        map1.entrySet().stream().forEach((Map.Entry<String, Integer> entry) -> {
            System.out.println("key = " + entry.getKey());
            System.out.println(", value = " + entry.getValue());
        });
    }
}
