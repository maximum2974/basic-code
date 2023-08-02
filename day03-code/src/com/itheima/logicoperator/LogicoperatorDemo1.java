package com.itheima.logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //1、 & 并且
        //两边都为真，结果才是真
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        //2、 | 或者
        //两边都为假，结果才是假
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

        //3、 ^ 异或
        //相同为false，不同为true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //4、 ！ 取反
        System.out.println(!false);
        System.out.println(!true);
    }
}
