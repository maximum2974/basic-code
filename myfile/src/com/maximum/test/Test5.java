package com.maximum.test;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        /*
        需求:
            统计一个文件夹的总大小
        */

        File file = new File("E:\\java");
        long len = getLen(file);
        System.out.println(len);
    }

    public static long getLen(File src){
        long len = 0;
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                long length = file.length();
                len += length;
            }else{
                len += getLen(file);
            }
        }
        return len;
    }
}
