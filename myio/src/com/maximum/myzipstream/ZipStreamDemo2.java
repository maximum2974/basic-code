package com.maximum.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        压缩流:
            需求:
                把E:\\java\\c.txt打包成一个压缩包
         */

        File src = new File("E:\\java\\c.txt");
        File dest = new File("E:\\java");
        toZip(src,dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"c.zip")));
        ZipEntry entry = new ZipEntry("c.txt");
        zos.putNextEntry(entry);
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read()) != -1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
