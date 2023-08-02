package com.maximum.a01mymap;

import java.util.*;

public class A06_MapDemo6 {
    public static void main(String[] args) {
        /*
        某个班级80名学生，现在需要组成秋游活动
        班长提供了四个景点依次是(A、B、C、D)
        每个学生只能选择一个景点，请统计出最终哪个经典想去的人数最多
         */

        String[] arr = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            //判断当前的景点在map集合中是否存在
            if(hm.containsKey(name)){
                int count = hm.get(name);
                count++;
                hm.put(name,count);
            }else{
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(count > max){
                max = count;
            }
        }

        Set<Map.Entry<String, Integer>> entries1 = hm.entrySet();
        for (Map.Entry<String, Integer> Entry1 : entries1) {
            int count = Entry1.getValue();
            if(count == max){
                System.out.println(Entry1.getKey() + " = " + count);
            }
        }
    }
}
