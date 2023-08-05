package com.maximum.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        /*
        方法引用(引用构造方法)
        格式
            类名::new
        目的
            创建这个类的对象
        需求:
            集合里面存储姓名和年龄,要求封装成Student对象并收集到List集合中
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14","赵敏,13","张强,20","张三丰,100","张良,35");

        List<Student> newList2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
