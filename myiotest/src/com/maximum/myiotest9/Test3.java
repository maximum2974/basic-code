package com.maximum.myiotest9;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("myiotest\\a.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);
    }
}
