package com.maximum.myiotest5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。

          运行结果要求：
            被点到的学生不会再被点到。
            但是如果班级中所有的学生都点完了， 需要重新开启第二轮点名。

          核心思想：
               点一个删一个，把删除的备份，全部点完时还原数据。
        */

        String src = "myiotest\\names.txt";
        String backups = "myiotest\\backups.txt";

        ArrayList<String> list = readFile(src);
        if(list.size() == 0){
            list = readFile(backups);
            writeFile(src, list, false);
            new File(backups).delete();
        }

        Collections.shuffle(list);
        String stuInfo = list.remove(0);
        System.out.println("当前被点到的学生为: " + stuInfo);
        writeFile(src, list, false);
        writeFile(backups, stuInfo, true);
    }

    private static void writeFile(String pathFile, ArrayList<String> list, boolean isAppend) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile, isAppend));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }

    private static void writeFile(String pathFile, String str, boolean isAppend) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile, isAppend));
        bw.write(str);
        bw.newLine();
        bw.close();
    }

    private static ArrayList<String> readFile(String pathFile) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(pathFile));
        String line;
        while((line = br.readLine()) != null){
            list.add(line);
        }
        br.close();
        return list;
    }
}
