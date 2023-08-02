package com.maximum.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //jdk5以后 int Integer 之间是可以相互转化的
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print("]");
    }
}
