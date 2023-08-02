package com.maximum.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //1、创建集合
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lis",24);
        Student s3 = new Student("wangwu",25);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
