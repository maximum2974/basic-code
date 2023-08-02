package com.maximum.a05innerclassdemo5;

public class Outer {
    public void show(){
        int a = 10;

        //局部内部类
        class Inner{
            String name;
            int age;

            public void method(){
                System.out.println("局部内部类中的method1方法");
            }

            public static void method2(){
                System.out.println("局部内部类中的method2静态方法");
            }
        }

        //创建局部内部类的对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method();
        Inner.method2();
    }
}
