package com.maximum.myconvertstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        将本地文件中的GBK文件，转成UTF-8
         */

        FileReader fr = new FileReader("myio\\b.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("myio\\d.txt", Charset.forName("UTF-8"));
        int b;
        while((b = fr.read()) != -1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
