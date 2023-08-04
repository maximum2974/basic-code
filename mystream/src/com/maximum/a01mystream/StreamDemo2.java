package com.maximum.a01mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo2 {
    public static void main(String[] args) {
        /*
        单列集合    default Stream<E> stream()          Collection中的默认方法
        双列集合    无                                  无法直接使用stream流
        数组        public static <T> Stream<T> stream(T[] array)  Arrays工具类中的静态方法
        一堆零散数据 public static<T> Stream<T> of(T... values) Stream接口中的静态方法
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a","b","c","d","e");
        //Stream<String> stream1 = list.stream();
        //使用终结方法打印流水线上的数据
        /*stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s:以此表示流水线上的每一个数据
                System.out.println(s);
            }
        });*/

        list.stream().forEach(s -> System.out.println(s));
    }
}
