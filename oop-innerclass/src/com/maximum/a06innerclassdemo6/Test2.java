package com.maximum.a06innerclassdemo6;

public class Test2 {
    public static void main(String[] args) {
        Swim s = new Swim(){
            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        };
        //编译看左边，运行看右边
        s.swim();

        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        }.swim();
    }
}
