package com.maximum.test2;

import com.maximum.test1.MyThread;

public class MyRunnable implements Runnable{
    int count = 100;
    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if(count < 10){
                    System.out.println("礼物还剩下" + count + "不再赠送");
                    break;
                }else{
                    count--;
                    System.out.println(Thread.currentThread().getName() + "在赠送礼物,还剩下" + count + "个礼物");
                }
            }
        }
    }
}
