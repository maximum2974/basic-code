package com.maximum.a01polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

        //多态的弊端
        //不能调用子类的特有功能
        //当调用成员方法的时候，编译看左边，运行看右边
        //那么在编译的时候会先检查左边的父类中有没有这个方法，如果没有直接报错
        //a.lookHome();

        //解决方案
        //变回子类类型就可以了
        /*Dog d = (Dog) a;
        d.lookHome();*/

        //新特性
        //先判断a是否为Dog类型，如果是，则强转成Dog类型，转换之后变量名为d
        //如果不是，则不强转，结果直接是false
        if(a instanceof Dog d){
            d.lookHome();
        }else if(a instanceof Cat c){
            c.catchMouse();
        }else{
            System.out.println("没有这个类型，无法转换");
        }
    }
}

class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
