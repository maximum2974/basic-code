package com.maximum.a05interfacedemo5;

public class PingPongPlayer extends Player implements English{

    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在学说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学乒乓球");
    }
}
