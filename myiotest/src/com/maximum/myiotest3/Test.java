package com.maximum.myiotest3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的信息，格式为：张三-男-23
            每一个学生信息占一行。
            要求通过程序实现随机点名器。
            70%的概率随机到男生
            30%的概率随机到女生
            随机100万次，统计结果。看生成男生和女生的比例是不是接近于7：3
        */

        ArrayList<String> boyNameList = new ArrayList<>();
        ArrayList<String> girlNameList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myiotest\\names.txt"));
        String line;
        while((line = br.readLine()) != null){
            String[] arr = line.split("-");
            if(arr[1].equals("男")){
                boyNameList.add(line);
            }else{
                girlNameList.add(line);
            }
        }
        br.close();

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);

        int boyCount = 0;
        int girlCount = 0;

        Random r = new Random();

        for (int i = 0; i < 1000000; i++) {
            int index = r.nextInt(list.size());
            int weight = list.get(index);
            if(weight == 1){
                Collections.shuffle(boyNameList);
                String boyInfo = boyNameList.get(0);
                System.out.println(boyInfo);
                boyCount++;
            }else{
                Collections.shuffle(girlNameList);
                String girlInfo = girlNameList.get(0);
                System.out.println(girlInfo);
                girlCount++;
            }
        }

        System.out.println("随机抽取100万次，其中男生被抽到了" + boyCount);
        System.out.println("随机抽取100万次，其中女生被抽到了" + girlCount);
    }
}
