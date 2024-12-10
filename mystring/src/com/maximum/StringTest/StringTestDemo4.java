package com.maximum.StringTest;

import java.util.ArrayList;

public class StringTestDemo4 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米",1999);
        Phone p2 = new Phone("苹果",8999);
        Phone p3 = new Phone("华为",5999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> PhoneInfo = getPhoneInfo(list);
        for (int i = 0; i < PhoneInfo.size(); i++) {
            Phone phone = PhoneInfo.get(i);
            System.out.println(phone.getName() + ", " + phone.getPrice());
        }
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> resultlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if(price < 6000){
                resultlist.add(p);
            }
        }
        return resultlist;
    }
}
