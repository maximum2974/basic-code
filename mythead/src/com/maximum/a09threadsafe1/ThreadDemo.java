package com.maximum.a09threadsafe1;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        需求: 电影院有100张票，有三个卖票
         */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
