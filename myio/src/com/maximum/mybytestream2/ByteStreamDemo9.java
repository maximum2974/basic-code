package com.maximum.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @BelongsProject: basic-code
 * @BelongsPackage: com.maximum.mybytestream2
 * @Author: maximum
 * @CreateTime: 2023-10-15
 * @Description: TODO
 * @Version: 1.0
 */

public class ByteStreamDemo9 {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * JDK9:IO流中捕获异常的写法
         */

        FileInputStream fis = new FileInputStream("E:\\maximum\\movie.mp4");
        FileOutputStream fos = new FileOutputStream("myio:\\copy.mp4");

        try(fis;fos){
            int len;
            byte[] bytes = new byte[1024 * 1014 * 5];
            while((len = fis.read(bytes)) != -1){
                fos.write(bytes, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
