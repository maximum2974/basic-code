package com.maximum.a02jdk8datedemo;

import java.time.LocalTime;

public class A06_LocalDateTimeDemo {
    public static void main(String[] args) {
        //获取本地时间的日历对象（包含 时分秒）
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间: " + nowTime);

        int hour = nowTime.getHour();
        System.out.println("hour: " + hour);

        int minute = nowTime.getMinute();
        System.out.println("minute: " + minute);

        int second = nowTime.getSecond();
        System.out.println("second: " + second);

        int nano = nowTime.getNano(); //纳秒
        System.out.println("nano: " + nano);

        System.out.println("--------------------------");

        System.out.println(LocalTime.of(8,20));
        System.out.println(LocalTime.of(8,20,30));
        System.out.println(LocalTime.of(8,20,30,150));
        LocalTime mTime = LocalTime.of(8, 20, 30, 150);

        //is系列方法
        System.out.println(nowTime.isBefore(mTime));
        System.out.println(nowTime.isAfter(mTime));

        //with系列的方法，只能修改时、分、秒
        System.out.println(nowTime.withHour(10));

        //minus系列的方法，只能修改时、分、秒
        System.out.println(nowTime.minusHours(10));

        //plus系列方法，只能修改时、分、秒
        System.out.println(nowTime.plusHours(10));
    }
}
