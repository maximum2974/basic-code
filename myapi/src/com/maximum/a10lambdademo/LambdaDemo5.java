package com.maximum.a10lambdademo;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @BelongsProject: basic-code
 * @BelongsPackage: com.maximum.a10lambdademo
 * @Author: maximum
 * @CreateTime: 2023-12-04
 * @Description: TODO
 * @Version: 1.0
 */

public class LambdaDemo5 {
    @Test
    public void test1(){
        List<String> list = Arrays.asList("apple", "banana", "orange");
        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }

    @Test
    public void test2(){
        List<String> list = Arrays.asList("apple", "banana", "orange");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        list.forEach(System.out::println);
    }

    @Test
    public void test3(){
        List<String> list = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
    }

    @Test
    public void test4(){
        List<String> list = Arrays.asList("apple", "banana", "orange");
        List<Integer> list2 = new ArrayList<>();
        for (String s : list) {
            list2.add(s.length());
        }

        List<Integer> list3 = list.stream().map(s -> s.length()).collect(Collectors.toList());
    }

    @Test
    public void test5(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = 0;
        for (Integer v : list) {
            sum += v;
        }
        System.out.println(sum);

        int sum2 = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum2);
    }

    @Test
    public void test6(){
        List<String> list = Arrays.asList("apple", "banana", "orange");
        Map<Integer, List<String>> groups = new HashMap<>();
        for (String s : list) {
            int length = s.length();
            if(!groups.containsKey(length)){
                groups.put(length, new ArrayList<>());
            }
            groups.get(length).add(s);
        }
        System.out.println(groups);

        Map<Integer, List<String>> groups2 = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groups2);
    }
}
