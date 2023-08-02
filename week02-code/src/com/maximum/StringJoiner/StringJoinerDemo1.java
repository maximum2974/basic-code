package com.maximum.StringJoiner;

//字符串拼接的底层原理
//如果没有变量参与，都是字符串直接相加，编译之后就是拼接之后的结果，会复用串池中的字符串
//如果有变量参与，每一行拼接的代码，都会在内存中创建新的字符串，浪费内存

//StringBuilder提高效率原理图
//所有要拼接的内容都会往StringBuilder中放，不会创建很多无用的空间，节约内存

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //public StringJoiner(间隔符号)
        //public StringJoiner(间隔符号,开始符号,结束符号)

        //1
        StringJoiner sj = new StringJoiner("---");
        //添加元素
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);

        //2
        StringJoiner sj1 = new StringJoiner(",","[","]");
        sj1.add("aaa").add("bbb").add("ccc");
        System.out.println(sj1);

        String str = sj1.toString();
        System.out.println(str);
    }
}
