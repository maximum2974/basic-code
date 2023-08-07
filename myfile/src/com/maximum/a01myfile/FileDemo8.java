package com.maximum.a01myfile;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        /*
        （掌握）public File[] listFiles()                获取当前该路径下所有内容
        */

        //1. listFiles()   获取当前该路径下所有内容
        File f = new File("E:\\java");
        File[] arr = f.listFiles();
        for (File file : arr) {
            if(file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file);
            }
        }
    }
}
