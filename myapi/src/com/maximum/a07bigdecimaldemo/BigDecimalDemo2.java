package com.maximum.a07bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        /*
        public BigDecimal add(BigDecimal value)				// 加法运算
        public BigDecimal subtract(BigDecimal value)		// 减法运算
        public BigDecimal multiply(BigDecimal value)		// 乘法运算
        public BigDecimal divide(BigDecimal value)			// 除法运算
         */

        //1、加法
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(2.0);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //2、减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        //3、乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        //4、除法
        BigDecimal bd6 = bd1.divide(bd2,2, RoundingMode.HALF_UP);
        System.out.println(bd6);
    }
}
