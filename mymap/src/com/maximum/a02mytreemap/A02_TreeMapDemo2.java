package com.maximum.a02mytreemap;

import java.util.TreeMap;

public class A02_TreeMapDemo2 {
    public static void main(String[] args) {
        /*
        需求2:
            键:学生对象
            值:籍贯
            要求:按照学生年龄的升序排列,年龄一样按照姓名的字母排列,同姓名年龄视为同一个人
         */

        TreeMap<Student,String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        tm.put(s1, "江苏");
        tm.put(s2, "天津");
        tm.put(s3, "北京");

        System.out.println(tm);
    }
}
