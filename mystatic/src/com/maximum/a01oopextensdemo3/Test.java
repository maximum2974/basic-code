package com.maximum.a01oopextensdemo3;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu{
    String name = "Fu";
    String hobby = "喝茶";
}

class Zi extends Fu {
    String name = "Zi";
    String game = "打代码";

    public void show(){
        //打印Zi
        System.out.println(this.name);
        //打印Fu
        System.out.println(super.name);
        //打印喝茶
        System.out.println(super.hobby);
        System.out.println(this.hobby);
        //打印打代码
        System.out.println(this.game);
        System.out.println(game);
    }
}
