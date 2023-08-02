package com.maximum.a05interfacedemo5;

public abstract class Player extends Person{
    public abstract void study();

    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }
}
