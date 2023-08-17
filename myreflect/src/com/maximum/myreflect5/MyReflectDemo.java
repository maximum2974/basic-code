package com.maximum.myreflect5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        /*
        对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
        */

        Student s = new Student("zhangsan", 23, '男', 189.32, "睡觉");
        Teacher t = new Teacher("lisi", 2983.45);

        saveObject(s);
    }

    public static void saveObject(Object obj) throws IOException, IllegalAccessException {
        Class clazz = obj.getClass();

        BufferedWriter bw = new BufferedWriter(new FileWriter("myreflect\\a.txt"));

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);
            bw.write(name + "=" + value);
            bw.newLine();
        }
        bw.close();
    }
}
