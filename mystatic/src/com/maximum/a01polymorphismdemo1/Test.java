package com.maximum.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("curry");
        t.setAge(35);

        Administrator admin = new Administrator();
        admin.setName("harden");
        admin.setAge(33);

        register(s);
        register(t);
        register(admin);
    }
    //这个方法能接收老师，又能接收学生，还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p){
        p.show();
    }
}
