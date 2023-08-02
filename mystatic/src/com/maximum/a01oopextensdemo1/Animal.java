package com.maximum.a01oopextensdemo1;

public class Animal {
    public void eat(){
        System.out.println("吃东西");
    }

    //注意事项：
    //子类只能访问父类中非私有的成员
    public void drink(){
        System.out.println("喝水");
    }
}
