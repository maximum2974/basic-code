package com.maximum.a01mystream;

import java.util.ArrayList;

public class StreamDemo6 {
    public static void main(String[] args) {
        /*
        | Stream<T> filter(Predicate predicate)           | 用于对流中的数据进行过滤                                   |
        | ----------------------------------------------- | ---------------------------------------------------------- |
        | Stream<T> limit(long maxSize)                   | 返回此流中的元素组成的流，截取前指定参数个数的数据         |
        | Stream<T> skip(long n)                          | 跳过指定参数个数的数据，返回由该流的剩余元素组成的流       |
        | static <T> Stream<T> concat(Stream a, Stream b) | 合并a和b两个流为一个流                                     |
        | Stream<T> distinct()                            | 返回由该流的不同元素（根据Object.equals(Object) ）组成的流 |
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");

        //filter
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //返回值为true,表示当前数据留下
                //返回值为false,表示当前数据舍弃不要
                return s.startsWith("张");;
            }
        }).forEach(s -> System.out.println(s));*/

        /*Stream<String> stream1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> stream2 = stream1.filter(s -> s.length() == 3);
        stream2.forEach(s -> System.out.println(s));*/

        //limit 获取前几个元素
        list.stream().limit(3)
                .forEach(s -> System.out.println(s));

        //skip 跳过前几个元素
        list.stream().skip(3)
                .forEach(s -> System.out.println(s));
    }
}
