package com.maximum.myiotest1;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //利用糊涂包生成假数据，并写到文件当中
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        /*ArrayList<String> familyNameTempList = getData(familyNameStr, "(.{4})(，| 。)", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)",1);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "(.. ){4}..", 0);*/
        ArrayList<String> familyNameTempList = (ArrayList<String>) ReUtil.findAll("(.{4})(，| 。)", familyNameStr, 1);
        ArrayList<String> boyNameTempList = (ArrayList<String>) ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
        ArrayList<String> girlNameTempList = (ArrayList<String>) ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c + "");
            }
        }

        //boyNameTempList(男生的名字)
        //处理方案:去除其中的重复元素
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if(!boyNameList.contains(str)){
                boyNameList.add(str);
            }
        }

        //girlNameTempList(女生的名字)
        //处理方案:把里面的每一个元素用空格进行切割，得到每一个女生的名字
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                girlNameList.add(arr[i]);
            }
        }

        //5.生成数据
        //姓名(唯一)-性别-年龄
        ArrayList<String> list = getInfos(familyNameList,boyNameList,girlNameList,70,50);
        Collections.shuffle(list);

        //6.写出数据
        FileUtil.writeLines(list, "names.txt","UTF-8");
    }

    /*
    作用:
        获取男生和女生的信息
    形参:
        参数一: 装着姓氏的集合
        参数二: 装着男生名字的集合
        参数三: 装着女生名字的集合
        参数四: 男生的个数
        参数五: 女生的个数
     */
    public static ArrayList<String> getInfos(ArrayList<String> familyNameList,ArrayList<String> boyNameList,ArrayList<String> girlNameList
            ,int boyCount, int girlCount){
        //1.生成男生不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        while(true){
            if(boyhs.size() == boyCount){
                break;
            }
            //随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boyhs.add(familyNameList.get(0) + boyNameList.get(0));
        }

        //2.生成女生不重复的名字
        HashSet<String> girlhs = new HashSet<>();
        while(true){
            if(girlhs.size() == girlCount){
                break;
            }
            //随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlhs.add(familyNameList.get(0) + girlNameList.get(0));
        }

        //3.生成男生的信息并添加到集合当中
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 10;
            list.add(boyName + "-男-" + age);
        }

        //4.生成女生的信息并添加到集合当中
        for (String girlName : girlhs) {
            int age = r.nextInt(8) + 18;
            list.add(girlName + "-女-" + age);
        }
        return list;
    }
}
