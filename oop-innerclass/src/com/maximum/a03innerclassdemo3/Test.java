package com.maximum.a03innerclassdemo3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();

        oi.show();

        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
