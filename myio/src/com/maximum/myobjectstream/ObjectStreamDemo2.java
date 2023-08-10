package com.maximum.myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        需求:
            利用反序列化流/对象操作输入流，把文件中的对象读到程序当中
        构造方法:
            public ObjectInputStream(InputStream out)  把基本流变成高级流
        成员方法:
            public Object readObject()  把序列化到本地文件中的对象，读取到程序中来
         */

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myio\\a.txt"));
        Student o = (Student)ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
