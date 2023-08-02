package com.maximum.a01innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show(){
        System.out.println(carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    //内部类可以直接访问外部类的成员，包括私有
    //外部类要访问内部类的成员，必须创建对象
    class Engine{
        String engineName;
        int engineAge;
        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
