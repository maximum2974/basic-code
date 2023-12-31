package com.maximum.a02jdk8datedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class A05_LocalDateDemo {
    public static void main(String[] args) {
        //1.获取当前时间的日历对象(包含 年月日)
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期: " + nowDate);

        //2.获取指定的时间的日历对象
        LocalDate ldDate = LocalDate.of(2023, 1, 1);
        System.out.println("指定日期:  " + ldDate);

        System.out.println("=========================================");

        //3.get系列方法获取日历中的每一个属性值//获取年
        //获取年
        int year = ldDate.getYear();
        System.out.println("year: " + year);

        //获取月
        //方式一:
        Month m = ldDate.getMonth();
        System.out.println(m); //JANUARY
        System.out.println(m.getValue()); //1
        System.out.println("=========================================");

        //方式二:
        int month = ldDate.getMonthValue();
        System.out.println("month: " + month);

        System.out.println("=========================================");

        //获取日
        int day = ldDate.getDayOfMonth();
        System.out.println("day: " + day);

        //获取一年的第几天
        int dayOfYear = ldDate.getDayOfYear();
        System.out.println("dayOfyear: " + dayOfYear);

        //获取星期
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

        //is开头的方法表示判断
        System.out.println(ldDate.isBefore(ldDate)); //false
        System.out.println(ldDate.isAfter(ldDate)); //false

        //with开头的方法表示判断，只能修改年月日
        LocalDate withLocalDate = ldDate.withYear(2000);
        System.out.println(withLocalDate); //2000-01-01
        System.out.println(withLocalDate == ldDate); //false

        System.out.println("========================================");

        //minus开头的方法表示减少，只能减少年月日
        LocalDate minusLocalDate = ldDate.minusYears(1);
        System.out.println(minusLocalDate);

        //plus开头的方法表示增加，只能增加年月日
        LocalDate plusLocalDate = ldDate.plusDays(1);
        System.out.println(plusLocalDate);

        LocalDate birDate = LocalDate.of(2003, 11, 23);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);

        System.out.println("今天是你的生日吗? " + birMd.equals(nowMd));
    }
}
