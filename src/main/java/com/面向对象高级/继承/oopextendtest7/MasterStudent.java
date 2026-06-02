package com.面向对象高级.继承.oopextendtest7;

public class MasterStudent extends Student{
    public MasterStudent() {
    }

    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("研究生正在学习");
    }

    @Override
    public void sleep() {
        System.out.println("研究生正在高级公寓睡觉");
    }

}
