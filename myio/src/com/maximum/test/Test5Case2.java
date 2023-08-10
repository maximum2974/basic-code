package com.maximum.test;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test5Case2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio\\copy.txt"));
        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]), line);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\copy3.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
