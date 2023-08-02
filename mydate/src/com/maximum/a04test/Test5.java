package com.maximum.a04test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        /*
        判断任意的一个年份是闰年还是平年
         */

        //JDK7
        //我们可以把时间设置为2000年3月1日
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);//月份范围：0~11
        //再把日历往前一天
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //JDK8
        LocalDate ld = LocalDate.of(2000, 3, 1);
        LocalDate ld2 = ld.minusDays(1);
        int day1 = ld2.getDayOfMonth();
        System.out.println(day1);

        //true 闰年
        //false 平年
        System.out.println(ld.isLeapYear());

    }
}
