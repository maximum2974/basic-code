package com.maximum.a01oopextensdemo2;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Fu{
    String name = "Fu";
}

class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "zishow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
