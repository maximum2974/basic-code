package com.maximum.a08interfacedemo8;

//JDK7以前：接口中只能定义抽象方法
//JDK8：接口中可以定义有方法体的方法。（默认、静态）
//JDK9：接口中可以定义私有方法
//私有方法分为两种：普通的私有方法，静态的私有方法

public interface InterA {
    public default void show1(){
        System.out.println("show1方法开始执行了");
        show4();
    }

    public default void show2(){
        System.out.println("show2方法开始执行了");
        show4();
    }

    //普通的私有方法，给默认方法服务的
    private void show3(){
        System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
    }

    //静态的私有方法，给静态方法服务的
    private static void show4(){
        System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
    }
}
