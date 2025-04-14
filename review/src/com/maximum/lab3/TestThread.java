package com.maximum.lab3;

public class TestThread {
    public static void main(String args[]) {
        Thread star = new Thread(new Shape("******"));
        Thread line = new Thread(new Shape("---------"));
        star.setPriority(Thread.MIN_PRIORITY);
        line.setPriority(Thread.MAX_PRIORITY);
        star.start();
        line.start();
    }
}

class Shape implements Runnable {
    String text;
    public Shape(String text) {
        this.text = text;
    }
    public void run() {
        while (true) {
            System.out.println(text);
        }
    }
}
