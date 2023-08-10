package com.maximum.myconvertstream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        利用转换流按照指定字符编码读取
        F:\百度网盘下载\gbkfile.txt
         */

        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("myio\\gbkfile.txt"),"GBK");
        int ch;
        while((ch = isr.read()) != -1){
            System.out.print((char) ch);
        }
        isr.close();*/

        FileReader fr = new FileReader("myio\\gbkfile.txt", Charset.forName("GBK"));
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char) ch);
        }
        fr.close();
    }
}
