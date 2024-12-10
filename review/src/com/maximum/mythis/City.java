package com.maximum.mythis;

class Country{
    String name;
    void value(){
        name = "China";
    }
}

public class City extends Country{
    String name;
    void value(){
        name = "Shanghai";
        super.value();
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        City c = new City();
        c.value();
    }
}
