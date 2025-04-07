package com.maximum.myInflection;

public class TargetObject {
    private String value;

    public TargetObject(){
        value = "maximum";
    }

    public void publicMethod(String s){
        System.out.println("I love " + s);
    }

    private void privateMethod(){
        System.out.println("value is " + value);
    }
}
