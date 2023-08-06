package com.maximum.a01myfile;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        /*
        public boolean isDirectory()            判断此路径名表示的File是否为文件夹
        public boolean isFile()                 判断此路径名表示的File是否为文件
        public boolean exists()                 判断此路径名表示的File是否存在
        */

        //1.对一个文件的路径进行判断
        File f1 = new File("E:\\java\\maximum.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        //2.对一个文件夹的路径进行判断
        File f2 = new File("E:\\java");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

        //3.对一个不存在的路径进行判断
        File f3 = new File("E:\\java\\maximum1.txt");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());
    }
}
