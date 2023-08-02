package com.maximum.a02mytreemap;

import java.util.StringJoiner;
import java.util.TreeMap;

public class A03_TreeMapDemo3 {
    public static void main(String[] args) {
        /*
        字符串"aababcabcdabcde"
        请统计字符串中每一个字符出现的次数, 并按照以下格式输出
        a(5) b(4) c(3) d(2) e(1)

        分析:
            统计 ---->  计数器思想
            弊端: 如果我们要统计的东西比较多,非常的不方便


        新的统计思想: 利用map集合进行统计

        HashMap:
        TreeMap:
        如果题目中没有要求对结果进行排序,默认使用HashMap
        如果题目中要求对结果进行排序,请使用TreeMap

        键: 表示要统计的内容
        值: 表示次数
         */

        String s = "aababcabcdabcde";

        TreeMap<Character,Integer> tm = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //拿着c到集合中判断是否存在
            //存在，表示当前字符又出现了一次
            //不存在，表示当前字符是第一次出现
            if(tm.containsKey(c)){
                Integer count = tm.get(c);
                count++;
                tm.put(c, count);
            }else{
                tm.put(c, 1);
            }
        }

        /*StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));*/

        StringJoiner sj = new StringJoiner("","","");
        /*tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                String str1 = key.toString();
                String str2 = value.toString();
                sj.add(str1).add("(").add(str2).add(")");
            }
        });*/
        tm.forEach((key,value) -> sj.add(key + "").add("(").add(value + "").add(")"));

        System.out.println(sj);
    }
}
