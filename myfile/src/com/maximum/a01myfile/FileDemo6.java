package com.maximum.a01myfile;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        /*
        public File[] listFiles()  获取当前该路径下所有内容
         */

        File f1 = new File("E:\\java");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
