package com.maximum.myLocalDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class draft {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CHINA);
        LocalDate localDate = LocalDate.of(2020, 4, 20);
        System.out.println(localDate);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getClass().getName());
        LocalDate parse = LocalDate.parse("2021-04-20");
        System.out.println(parse);

        boolean leapYear = now.isLeapYear();
        System.out.println(leapYear);

        LocalDate localDate1 = now.minusWeeks(1);
        System.out.println(localDate1);

        LocalDate localDate2 = now.minusDays(1);
        System.out.println(localDate2);

        int monthValue = now.getMonthValue();
        System.out.println(monthValue);

        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);

        Month month = now.getMonth();
        System.out.println(month);
    }
}
