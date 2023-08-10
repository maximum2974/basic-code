package com.maximum.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test5Case1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio\\copy.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while((line = br.readLine()) != null){
            list.add(line);
        }
        br.close();

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });

        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\copy2.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }
}
