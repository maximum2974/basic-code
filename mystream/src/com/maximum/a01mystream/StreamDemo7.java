package com.maximum.a01mystream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        /*
        | static <T> Stream<T> concat(Stream a, Stream b) | 合并a和b两个流为一个流                                     |
        | Stream<T> distinct()                            | 返回由该流的不同元素（根据Object.equals(Object) ）组成的流 |
         */

        ArrayList<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
        list.add("张曼玉");
        list.stream().distinct().forEach(s -> System.out.println(s));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("林青霞");
        list1.add("张曼玉");
        list1.add("王祖贤");
        list1.add("柳岩");
        list1.add("张敏");
        list1.add("张无忌");
        list1.add("张曼玉");
        Stream.concat(list.stream(), list1.stream()).forEach(s -> System.out.println(s));
    }
}
