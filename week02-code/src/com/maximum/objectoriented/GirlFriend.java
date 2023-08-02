package com.maximum.objectoriented;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    //set:给成员变量赋值
    //get:对外提供成员变量的值
    public void setName(String name){
        //局部变量表示测试类中调用方法传递过来的数据
        //等号的左边：就表示成员位置的name
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age >= 18 && age <= 50){
            this.age = age;
        }else{
            System.out.println("非法参数");
        }
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;

    //private int age;
    /*public void method(){
        int age = 10;
        System.out.println(this.age);*/
    }
}
