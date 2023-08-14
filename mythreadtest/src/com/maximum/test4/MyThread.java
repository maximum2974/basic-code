package com.maximum.test4;

import java.util.Random;

public class MyThread extends Thread{
    //共享数据
    //100块,分成了3个包
    static double money = 100;
    static int count = 3;

    //最小的中奖金额
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class){
            if(count == 0){
                //判断:共享数据是否已经到了末尾(已经到了末尾)
                System.out.println(getName() + "没有抢到红包");
            }else{
                //判断:共享数据是否已经到了末尾(没有到末尾)
                //定义一个变量,表示中奖的金额
                double prize = 0;
                if(count == 1){
                    prize = money;
                }else{
                    //表示第一次,第二次(随机)
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;
                    prize = r.nextDouble(bounds);
                    if(prize < MIN){
                        prize = MIN;
                    }
                }
                //从money当中,去掉当前中奖金额
                money = money - prize;
                //红包个数-1
                count--;
                System.out.println(getName() + "抢到了" + prize + "元");
            }
        }
    }
}
