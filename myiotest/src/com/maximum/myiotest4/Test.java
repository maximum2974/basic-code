package com.maximum.myiotest4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。
            第三次必定是张三同学

          运行效果：
            第一次运行程序：随机同学姓名1
            第二次运行程序：随机同学姓名2
            第三次运行程序：张三
            …
        */

        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myiotest\\names.txt"));
        String line;
        while((line = br.readLine()) != null){
            String[] arr = line.split("-");
            list.add(arr[0]);
        }
        br.close();

        BufferedReader br2 = new BufferedReader(new FileReader("myiotest\\count.txt"));
        String countStr = br2.readLine();
        int count = Integer.parseInt(countStr);
        br2.close();
        count++;
        if(count == 3){
            System.out.println("张三");
        }else{
            Collections.shuffle(list);
            String stuInfo = list.get(0);
            System.out.println(stuInfo);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest\\count.txt"));
        bw.write(count + "");
        bw.close();
    }
}
