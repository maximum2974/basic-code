package com.maximum.a01myfile;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        /*
        public long length()            返回文件的大小(字节数量)
        public String getAbsolutePath() 返回文件的决定路径
        public String getPath()         返回定义文件时使用的路径
        public String getName()         返回文件的名称，带后缀
        public long lastModified()      返回文件的最后修改时间(时间毫秒值)
         */

        //1.返回文件的大小(字节数量)
        //细节1: 这个方法只能获取文件的大小，单位是字节
        //如果单位我们要是M. G. 可以不断的除以1024
        //细节2: 这个方法无法获取文件夹的大小
        //如果我们要获取一个文件夹的大小，需要把这个文件夹里面所有的文件大小都累加在一起
        File f1 = new File("E:\\java\\maximum.txt");
        long len = f1.length();
        System.out.println(len);

        //2. 返回文件的决定路径
        File f2 = new File("myfile\\a.txt");
        String path2 = f2.getAbsolutePath();
        System.out.println(path2);

        //3.返回定义文件时使用的路径
        File f3 = new File("myfile\\a.txt");
        String path3 = f3.getPath();
        System.out.println(path3);

        //4.返回文件的名称，带后缀
        //细节1:
        //a.txt
        //    a  文件名
        //    txt  后缀名、拓展名
        //细节2:
        //文件夹: 返回的就是文件夹的名字
        File f4 = new File("E:\\java\\maximum.txt");
        String name2 = f4.getName();
        System.out.println(name2);

        //5.返回文件的最后修改时间(时间毫秒值)
        File f5 = new File("E:\\java\\maximum.txt");
        long time = f5.lastModified();
        System.out.println(time);
    }
}
