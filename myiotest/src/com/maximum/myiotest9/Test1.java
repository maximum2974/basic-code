package com.maximum.myiotest9;

import java.util.Properties;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        /*
        Properties作为Map集合的操作
         */

        Properties prop = new Properties();

        //细节:虽然我们可以往Properties当中添加任意的数据类型，但是一般只往里面添加字符串类型的数据
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");
        prop.put("ddd","444");

        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object value = prop.get(key);
            System.out.println(key + "=" + value);
        }

        /*Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }*/
    }
}