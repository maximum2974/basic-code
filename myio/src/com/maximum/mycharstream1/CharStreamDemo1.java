package com.maximum.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        第一步: 创建对象
        public FileReader(File file)           创建字符输入流关联本地文件
        public FileReader(String pathname)     创建字符输入流关联本地文件
        第二步: 读取数据
        public int read()                      读取数据，都到末尾返回-1
        public int read(char[] buffer)         读取多个数据，读到末尾返回-1
        第三步: 释放资源
        public void close()                    释放资源/关流
         */

        FileReader fr = new FileReader("myio\\a.txt");
        int ch;
        //read() 细节:
        //1.read():默认也是一个字节一个字节的读取的，如果遇到中文就会一次读取多个
        //2.在读取之后，方法的底层还会进行解码并转成十进制
        //最终把这个十进制作为返回值
        //这个十进制的数据也表示在字符集上的数字
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
