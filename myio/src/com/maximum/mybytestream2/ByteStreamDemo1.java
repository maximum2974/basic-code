package com.maximum.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        演示: 字节输入流FileInputStream
        实现需求: 读取文件中的数据

        实现步骤:
            创建对象
            读取数据
            释放资源
         */

        FileInputStream fis = new FileInputStream("myio\\a.txt");
        int b1 = fis.read();
        System.out.println((char)b1);
        fis.close();
    }
}
