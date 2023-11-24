package com.maximum.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongsProject: basic-code
 * @BelongsPackage: com.maximum.a01jdk7datedemo
 * @Author: maximum
 * @CreateTime: 2023-11-24
 * @Description: TODO
 * @Version: 1.0
 */

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        /**
         * 假设出生年月日为: 2000-11-11
         * 请用字符串表示这个数据, 并将其转换为: 2000年11月11日
         * 创建一个Date对象表示2000年11月11日
         * 创建一个SimpleDateFormat对象, 并定义格式为年月日
         * 把时间变成: 2000年11月11日
         */
        String str = "2000-11-11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date);
        System.out.println(result);
    }
}
