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

    /**
     * 作用: 压缩
     * @param src 表示要压缩的文件
     * @param dest 表示压缩包的位置
     * @throws IOException
     */
    public static void toZip(File src, File dest) throws IOException {
        //1.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"c.zip")));
        //2.创建ZipEntry对象, 表示压缩包里面的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("c.txt");
        //3.把ZipEntry对象放到压缩包当中
        zos.putNextEntry(entry);
        //4.把src文件中的数据写到压缩包当中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read()) != -1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
