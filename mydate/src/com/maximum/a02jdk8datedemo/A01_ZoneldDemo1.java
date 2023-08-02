package com.maximum.a02jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneldDemo1 {
    public static void main(String[] args) {
        /*
        static Set<string> getAvailableZoneIds() 获取Java中支持的所有时区
        static ZoneId systemDefault() 获取系统默认时区
        static Zoneld of(string zoneld) 获取一个指定时区
        */

        //1、获取所有的时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //2、获取当前系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //3、获取一个指定时区
        ZoneId zoneId1 = ZoneId.of("Africa/Nairobi");
        System.out.println(zoneId1);
    }
}
