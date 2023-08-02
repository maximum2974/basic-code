package com.maximum.a04myset;

import java.util.HashSet;

public class A03_HashSetDemo2 {
    public static void main(String[] args) {
        /*
        需求: 创建一个存储学生对象的集合,存储多个学生对象
        实用程序实现在控制台遍历该集合
        要求: 学生对象的成员变量值相同,我们就认为是同一个对象
        */

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhangsan", 23);

        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        System.out.println(hs);
    }
}
