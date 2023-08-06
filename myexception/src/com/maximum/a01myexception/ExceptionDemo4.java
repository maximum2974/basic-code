package com.maximum.a01myexception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        /*
        public String getMessage()         返回此 throwable 的详细消息字符串
        public String toString()           返回此可抛出的简短描述
        public void printStackTrace()      在底层是利用System.err.println进行输出
                                           把异常的错误信息以红色字体输出在控制台
                                           细节: 仅仅是打印信息, 不会停止程序运行
         */

        int[] arr = {1,2,3,4,5,6};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //String message = e.getMessage();
            //System.out.println(message);

            /*String str = e.toString();
            System.out.println(str);*/

            e.printStackTrace();
        }

        System.out.println("maximum");
    }
}
