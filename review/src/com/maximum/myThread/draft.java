package com.maximum.myThread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class draft {
    public static void main(String[] args) {
        /*class MyThread extends Thread{
            public void run(){
                System.out.println("MyThread is running...");
            }
        }
        MyThread myThread = new MyThread();
        myThread.start();*/

//        class MyRunnable implements Runnable{
//            public void run(){
//                System.out.println("MyRunnable is running...");
//            }
//        }
//        Thread myThread = new Thread(new MyRunnable());
//        myThread.start();

        class MyTask implements Runnable{
            public void run(){
                System.out.println("MyTask is running...");
            }
        }
        Executor executor = Executors.newFixedThreadPool(3);
        executor.execute(new MyTask());
    }
}
