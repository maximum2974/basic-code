package com.maximum.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //1、获取Runtime的对象
        //Runtime r1 = Runtime.getRuntime();

        //2、exit 停止虚拟机
        //Runtime.getRuntime().exit(0);

        //3、获得CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //4、总内存大小，单位byte字节
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //5、已经获取的总内存大小，单位byte字节
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //6、剩余内存的大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //7、运行cmd命令
        //shutdown : 关机
        //加上参数才能执行
        //-s : 默认在1分钟之后关机
        //-s -t 指定时间 : 指定关机时间
        //-a : 取消关机操作
        //-r : 关机并重启
        Runtime.getRuntime().exec("shutdown -s -t 10");
    }
}
