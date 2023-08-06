package com.maximum.a01myexception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        /*
        3. 如果try中遇到的问题没有被捕获，怎么执行?
           相当于try...catch的代码白写了,最终还是会交给虚拟机进行处理
        4. 如果try中遇到了问题，那么try下面的其他代码还会执行吗?
           下面的代码就不会执行了，直接跳转到对应的catch中，执行catch里面的语句体
           但是如果没有对应的catch与之匹配，那么还是会交给虚拟机进行处理
         */

        int[] arr = {1,2,3,4,5,6};

        try{
            System.out.println(arr[10]);
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }

        System.out.println("看看我执行了吗?");
    }
}
