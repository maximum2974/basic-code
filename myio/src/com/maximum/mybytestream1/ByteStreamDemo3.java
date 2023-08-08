package com.maximum.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        void write(int b)                     一次写一个字节数据
        void write(byte[] b)                  一次写一个字节数组数据
        void write(byte[] b, int off, int len)一次写一个字节数组的部分数据
        参数一:
            数组
        参数二:
            起始索引
        参数三:
            个数
         */


        FileOutputStream fos = new FileOutputStream("myio\\a.txt");
        //1. 一次写一个字节数据
        /*fos.write(97);
        fos.write(98);*/
        //2. 一次写一个字节数组数据
        /*byte[] bytes = {97,98,99,100,101};
        fos.write(bytes);*/

        //3. 一次写一个字节数组的部分数据
        byte[] bytes = {97,98,99,100,101};
        fos.write(bytes, 1, 2);

        fos.close();
    }
}
