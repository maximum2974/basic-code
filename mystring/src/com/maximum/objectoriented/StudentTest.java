package com.maximum.objectoriented;

public class StudentTest {
    public static void main(String[] args) {
        //调用的空参构造
        Student s = new Student("maximum",18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
