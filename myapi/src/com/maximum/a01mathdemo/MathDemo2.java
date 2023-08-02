package com.maximum.a01mathdemo;

public class MathDemo2 {
    public static void main(String[] args) {
        /*//判断一个数是否为质数
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        boolean b = isPrime2(number);
        if(b){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }*/

        long start = System.currentTimeMillis();
        //判断1~10000之间有多少个质数
        for (int i = 0; i < 100000; i++) {
            boolean flag = isPrime2(i);
            if(flag){
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static boolean isPrime1(int number){
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime2(int number){
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
