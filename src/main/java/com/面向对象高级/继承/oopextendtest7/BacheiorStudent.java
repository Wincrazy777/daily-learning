package com.面向对象高级.继承.oopextendtest7;

public class BacheiorStudent extends Student{
    public BacheiorStudent() {
    }

    public BacheiorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("本科生正在学习");
    }
}
