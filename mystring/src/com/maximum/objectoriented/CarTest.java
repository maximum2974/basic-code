package com.maximum.objectoriented;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            //把汽车对象添加到数组当中
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + ", " + car.getPrice() + ", " + car.getColor());
        }
    }
}
