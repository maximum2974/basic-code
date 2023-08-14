package com.maximum.test1;

public class MyThread extends Thread{
    //第一种方式实现多线程,测试类中MyThread会创建多次,所以需要加static
    static int ticket = 1000;

    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if(ticket == 0){
                    break;
                }else{
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(getName() + "在卖票,还剩下" + ticket + "张票");
                }
            }
        }
    }
}
