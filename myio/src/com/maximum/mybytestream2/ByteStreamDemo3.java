package com.maximum.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        字节输入流循环读取
         */

        FileInputStream fis = new FileInputStream("myio\\a.txt");
        int b;
        while((b = fis.read()) != -1){
            System.out.print((char)b);
        }

        fis.close();

    }
}
