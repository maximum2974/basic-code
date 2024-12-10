package com.maximum.StringDemo;

public class StringDemo10 {
    public static void main(String[] args) {
        String talk = "你玩的真好，以后不要再玩了，TMD";
        //定义一个敏感词库
        String[] arr = {"TMD","CNM","SB","MLGB"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }

        System.out.println(talk);
    }
}
