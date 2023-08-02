package com.itheima.assigningoperator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        //细节
        //+=，-=，*=，/=，%=底层都隐藏一个强制类型转换
        short s = 1;
        //把左边和右边相加，得到结果2，再赋值给左边的变量
        s += 1;
        //等同于：s = (short) (s + 1);
        System.out.println(s);
    }
}
