package com.maximum.demo1;

//private:同一个类中
//空着不写:同一个类中，同一个包中其他类
//protected:同一个类中，同一个包中其他类，不同包下的子类
//public:同一个类中，同一个包中其他类，不同包下的子类，不同包下的无关类

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        //System.out.println(a.name);
    }
}
