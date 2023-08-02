package com.maximum.objectoriented;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("苹果",9999,"远峰蓝");
        Phone p2 = new Phone("华为",7999,"银色");
        Phone p3 = new Phone("小米",5999,"灰色");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        double avg = sum * 1.0 / arr.length;
        System.out.println(avg);
    }
}
