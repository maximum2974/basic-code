package com.maximum.lab2;

public class TestThread {

    public static void main(String[] args) {
        Account acc = new Account(100);

        Thread Lee = new Thread(new Clerk("Lee", 50, acc));
        Thread Tim = new Thread(new Clerk("Tim", 100, acc));

        Lee.start();
        Tim.start();
    }
}

// 银行账户类
class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance(Clerk c) {
        System.out.format("%s gets the balance: Current balance is %d%n", c.name, balance);
        return balance;
    }

    public void setBalance(Clerk c, int newBalance) {
        System.out.format("%s sets the balance: Old balance is %d%n", c.name, balance);
        balance = newBalance;
        System.out.format("%s sets the balance: New balance is %d%n", c.name, balance);
    }
}

// 银行职员类，实现Runnable
class Clerk implements Runnable {
    String name;
    int amount;
    Account acc;

    public Clerk(String name, int amount, Account acc) {
        this.name = name;
        this.amount = amount;
        this.acc = acc;
    }

    public void run() {
        int balance, newBalance;
        balance = acc.getBalance(this);           // 获取余额
        newBalance = balance + amount;            // 增加金额
        acc.setBalance(this, newBalance);         // 设置新余额
    }
}