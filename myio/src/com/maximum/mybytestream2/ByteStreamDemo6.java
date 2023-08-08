package com.maximum.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        /*
        文件拷贝改写
         */

        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\java\\c.txt");
        FileOutputStream fos = new FileOutputStream("myio\\copy.txt");
        int len;
        byte[] bytes = new byte[1024 *1024 *5];
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
