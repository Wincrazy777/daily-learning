package com.面向对象高级.继承.oopextendtest7;

public class BachelorStudent extends Student{
    public BachelorStudent() {
    }

    public BachelorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("本科生正在学习");
    }
}
