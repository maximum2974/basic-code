package com.maximum.a01myexception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        /*
        自己处理捕获异常:
            1. 如果try中没有遇到问题，怎么执行?
               会把try里面所有的代码全部执行完毕，不会执行catch里面的代码
            2. 如果try中可能遇到多个问题，怎么执行?
               如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面
               了解性:
                   在JDK7以后，我们可以在catch中同时捕获多个异常，中间用|进行隔开
                   表示如果出现了A异常或者B异常的话，采取同一种处理方案
            3. 如果try中遇到的问题没有被捕获，怎么执行?
            4. 如果try中遇到了问题，那么try下面的其他代码还会执行吗?
         */

        int[] arr = {1,2,3,4,5,6};
        try{
            System.out.println(arr[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("maximum");

        try{
            System.out.println(arr[10]);
            System.out.println(2/0);
            String s = null;
            System.out.println(s.equals("abc"));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }

        System.out.println("maximum");
    }
}
