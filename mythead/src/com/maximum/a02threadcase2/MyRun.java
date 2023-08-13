package com.maximum.a02threadcase2;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            /*Thread t = Thread.currentThread();
            System.out.println(t.getName() + "Hello World!");*/
            System.out.println(Thread.currentThread().getName() + "Hello World!");
        }
    }
}
