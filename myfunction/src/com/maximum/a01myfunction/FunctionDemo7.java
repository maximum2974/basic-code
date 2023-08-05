package com.maximum.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo7 {
    public static void main(String[] args) {
        /*
        需求:
            集合中存储一些字符串的数据，比如: 张三,23
            收集到Student类型的数组中
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15","周芷若,14","赵敏,13","张强,20","张三丰,40");
        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
