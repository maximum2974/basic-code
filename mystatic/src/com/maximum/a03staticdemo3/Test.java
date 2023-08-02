package com.maximum.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("zhangsan",23,"male");
        Student stu2 = new Student("lisi",24,"male");
        Student stu3 = new Student("wangwu",25,"female");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
