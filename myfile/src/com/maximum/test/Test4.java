package com.maximum.test;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        /*
        删除一个多级文件夹(有内容)

        1. 先删除文件夹里面所有的内容
        2. 再删除自己
         */

        File file = new File("E:\\java\\bbb");
        delete(file);
    }

    public static void delete(File src){
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else{
                delete(file);
            }
        }
        src.delete();
    }
}
