package com.maximum.mybufferedstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
        字符缓冲输入流:
            构造方法:
                public BufferedReader(Reader r)
            特有方法:
                public String readLine() 读一整行
         */

        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt", true));
        bw.write("123");
        bw.newLine();
        bw.write("456");
        bw.newLine();
        bw.close();
    }
}
