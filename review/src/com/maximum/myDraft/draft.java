package com.maximum.myDraft;

public class draft {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Person");
        Person person = (Person)clazz.newInstance();

    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}