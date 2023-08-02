package com.maximum.a01oopextensdemo4;

public class Test {
    public static void main(String[] args) {
        OverseaStudent o = new OverseaStudent();
        o.lunch();
    }
}

class Person{
    public void eat(){
        System.out.println("吃米饭，吃菜");
    }

    public void drink(){
        System.out.println("喝开水");
    }
}

class OverseaStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();
        super.eat();
        super.drink();
    }
    //当父类中方法，不能满足子类现在的需求时，我们就需要把这个方法进行重写
    //注意：子类中重写的方法上面需要加上@Override
    //建议：重写的方法尽量与父类保持一致
    //只有被添加到虚方法表中的方法才能被重写
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}
