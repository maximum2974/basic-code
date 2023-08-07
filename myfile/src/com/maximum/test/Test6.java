package com.maximum.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        /*
        需求: 统计一个文件夹中每种文件的个数并打印(考虑子文件夹)
        打印格式如下:
            txt: 3个
            doc: 4个
            jpg: 6个
         */

        File file = new File("E:\\");
        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);

    }

    public static HashMap<String,Integer> getCount(File src){
        HashMap<String,Integer> hm = new HashMap<>();
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                String name = file.getName();
                String[] arr = name.split("\\.");
                if(arr.length >= 2){
                    String endName = arr[arr.length - 1];
                    if(hm.containsKey(endName)){
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName, count);
                    }else{
                        hm.put(endName, 1);
                    }
                }
            }else{
                HashMap<String, Integer> sonMap = getCount(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if(hm.containsKey(key)){
                        int count = hm.get(key);
                        count += value;
                        hm.put(key, count);
                    }else{
                        hm.put(key, value);
                    }
                }
            }
        }
        return hm;
    }
}
