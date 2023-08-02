package com.maximum.a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        //抽象类不能实例化
        //Person p = new Person();

        Student s = new Student("zhangsan",23);
        System.out.println(s.getName() + ", " + s.getAge());
    }
}
