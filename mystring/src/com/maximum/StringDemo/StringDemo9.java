package com.maximum.StringDemo;

public class StringDemo9 {
    public static void main(String[] args) {

        //定义一个字符串记录身份证号码
        String id = "321281202001011234";
        //获取出生年日
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12, 14);

        System.out.println("人物信息为: ");
        System.out.println("出生年月日:" + year + "年" + month + "月" + day + "日1");

        char gender = id.charAt(16);
        //利用ascii码表进行转换
        //'0'-----> 48
        //'1'-----> 49
        //.........
        //'9'-----> 57
        int num = gender - 48;
        if(num % 2 == 0){
            System.out.println("性别为:女");
        }else{
            System.out.println("性别为:男");
        }
    }
}
