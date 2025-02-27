package com.maximum.myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义"
                ,
                "罗贯中"
                , 10.1));
        col.add(new Book("小李飞刀"
                ,
                "古龙"
                , 5.1));
        col.add(new Book("红楼梦"
                ,
                "曹雪芹"
                , 34.6));
        //System.out.println("col=" + col);
        //现在老师希望能够遍历 col 集合
        //1. 先得到 col 对应的 迭代器
        Iterator iterator = col.iterator();
        //2. 使用 while 循环遍历
        // while (iterator.hasNext()) {//判断是否还有数据
        // //返回下一个元素，类型是 Object
        // Object obj = iterator.next();
        // System.out.println("obj=" + obj);
        // }
        //老师教大家一个快捷键，快速生成 while => itit
        //显示所有的快捷键的的快捷键 ctrl + j
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        //3. 当退出 while 循环后 , 这时 iterator 迭代器，指向最后的元素
        // iterator.next();//NoSuchElementException
        //4. 如果希望再次遍历，需要重置我们的迭代器
        iterator = col.iterator();
        System.out.println("===第二次遍历===");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    // 构造函数
    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Getter 和 Setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
