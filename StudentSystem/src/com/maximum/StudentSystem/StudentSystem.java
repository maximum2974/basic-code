package com.maximum.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";




    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("----------欢迎来到maximum的学生管理系统----------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.print("请输入您的选择: ");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch(choose){
                case ADD_STUDENT -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case QUERY_STUDENT -> queryStudent(list);
                case EXIT -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(list, id);
            if(flag){
                System.out.println("id已经存在，请重新录入");
            }else{
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的住址");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);
        System.out.println("学生信息添加成功");
    }

    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();
        int index = getIndex(list, id);
        if(index >= 0){
            list.remove(index);
            System.out.println("id为" + id + "的学生删除成功");
        }else{
            System.out.println("id不存在，删除失败");
        }
    }

    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id = sc.next();

        int index = getIndex(list, id);
        if(index == -1){
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }

        Student stu = list.get(index);

        System.out.println("请输入要修改的学生姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");
    }

    public static void queryStudent(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    //判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list,String id){
        /*for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIndex(list,id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
