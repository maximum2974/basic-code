package com.maximum.a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Frog f = new Frog("小青",1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();

        //创建兔子对象
        Rabbit r = new Rabbit("小白",2);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();

        //创建狗对象
        Dog d = new Dog("小狗",3);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.swim();
    }
}
