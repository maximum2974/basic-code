package com.maximum.a04myset;

import java.util.TreeSet;

public class A06_TreeSetDemo2 {
    public static void main(String[] args) {
        /*
        需求: 创建TreeSet集合,并添加三个学生对象
        学生对象属性:
            姓名, 年龄
            要求按照学生的年龄进行排序
            同年龄按照姓名字母pailie
            同姓名，同年龄认为是一个人

        方式一:
            默认的排序规则/自然排序
            Student实现Comparable接口, 重写里面的抽象方法, 再指定比较规则
         */

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);

        //TreeSet底层就是红黑树
    }
}
