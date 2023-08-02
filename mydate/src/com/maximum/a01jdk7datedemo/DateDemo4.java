package com.maximum.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
        String str = "2004-7-16";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-M-dd");
        Date date = sdf1.parse(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年M月dd日");
        String result = sdf2.format(date);
        System.out.println(result);
    }
}
