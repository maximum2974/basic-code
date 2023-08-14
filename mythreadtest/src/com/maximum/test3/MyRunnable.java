package com.maximum.test3;

import com.maximum.test1.MyThread;

public class MyRunnable implements Runnable{
    int number = 1;
    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if(number > 100){
                    break;
                }else{
                    if(number % 2 == 1){
                        System.out.println(Thread.currentThread().getName() + "打印数字" + number);
                    }
                    number++;
                }
            }
        }
    }
}
