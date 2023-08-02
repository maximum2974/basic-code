package com.maximum.a02systemdemo;

public class SystemDemo2 {
    public static void main(String[] args) {
        //细节：
        //1、如果数据源从数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        //2、在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
        //3、如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型
        Student s1 = new Student(12,"zhangsan");
        Student s2 = new Student(18,"lisi");
        Student s3 = new Student(30,"wangwu");
        Student[] arr1 = {s1,s2,s3};
        Student[] arr2 = new Student[3];
        System.arraycopy(arr1,0,arr2,0,3);
        for (int i = 0; i < arr2.length; i++) {
            Student stu = arr2[i];
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}

class Person{
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public Student(){
    }

    public Student(int age,String name){
        super(age,name);
    }
}
