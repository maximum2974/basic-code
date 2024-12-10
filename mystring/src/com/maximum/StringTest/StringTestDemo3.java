package com.maximum.StringTest;

import java.util.ArrayList;

public class StringTestDemo3 {
    public static void main(String[] args) {
        //1、创建集合
        ArrayList<User> list = new ArrayList<>();
        //2、创建三个用户对象
        User u1 = new User("maximum001","zhangsan","123456");
        User u2 = new User("maximum002","lisi","12345678");
        User u3 = new User("maximum003","wangwu","1234567");
        //3、把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4、调用方法查看id是否存在
        boolean flag = contains(list, "maximum001");
        System.out.println(flag);
    }

    public static boolean contains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                return true;
            }
        }
        return false;
    }
}
