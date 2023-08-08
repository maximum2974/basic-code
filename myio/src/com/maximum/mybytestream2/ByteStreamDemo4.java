package com.maximum.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
        文件拷贝: 选择一个比较小的文件
         */

        FileInputStream fis = new FileInputStream("E:\\java\\c.txt");
        FileOutputStream fos = new FileOutputStream("myio\\copy.txt");

        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }

        //释放资源
        //规则: 先开的后关闭
        fos.close();
        fis.close();
    }
}
