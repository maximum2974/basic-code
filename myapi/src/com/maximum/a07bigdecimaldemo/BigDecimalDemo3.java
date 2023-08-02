package com.maximum.a07bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

//UP:远离零方向的舍入模式
//DOWN:向零方向的舍入模式
//CEILING:向正无限大方向舍入的舍入模式
//FLOOR:向负无限大方向的舍入模式

public class BigDecimalDemo3 {
    public static void main(String[] args) {
        method_03();
        method_02();
        method_01();
    }

    public static void method_03(){
        BigDecimal b1 = new BigDecimal("0.3");
        BigDecimal b2 = new BigDecimal("4");
        System.out.println(b1.divide(b2,2, RoundingMode.HALF_UP));
    }

    public static void method_02(){
        BigDecimal b1 = new BigDecimal("1");
        BigDecimal b2 = new BigDecimal("3");
        System.out.println(b1.divide(b2,2,RoundingMode.FLOOR));
    }

    public static void method_01(){
        BigDecimal b1 = new BigDecimal("1");
        BigDecimal b2 = new BigDecimal("3");
        System.out.println(b1.divide(b2,2,RoundingMode.UP));
    }
}
