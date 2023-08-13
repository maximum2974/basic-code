package com.maximum.myiotest9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        Properties跟IO流结合的操作
         */

        Properties prop = new Properties();

        prop.put("aaa","bbb");
        prop.put("bbb","ccc");
        prop.put("ccc","eee");
        prop.put("ddd","ggg");

        FileOutputStream fos = new FileOutputStream("myiotest\\a.properties");
        prop.store(fos, "test");
        fos.close();

        /*BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest\\a.properties"));
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            bw.write(key + "=" + value);
            bw.newLine();
        }
        bw.close();*/
    }
}
