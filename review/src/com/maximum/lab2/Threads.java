package com.maximum.lab2;

public class Threads implements Runnable {
    String name;
    Thread t;

    Threads(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }

    public static void main(String[] args) {
        new Threads("One");
        new Threads("Two");
        new Threads("Three");

        try {
            Thread.sleep(10000); // Main thread sleeps to wait for other threads to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
