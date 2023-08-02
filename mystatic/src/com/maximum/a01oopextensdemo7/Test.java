package com.maximum.a01oopextensdemo7;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("maximum001","zhangsan",15000,8000);
        System.out.println(m.getId() + ", " + m.getName() + ", "
        + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("maximum002");
        c.setName("李四");
        c.setSalary(8000);
        System.out.println(c.getId() + ", " + c.getName() + ", "
                + c.getSalary());
        c.work();
        c.eat();
    }
}
