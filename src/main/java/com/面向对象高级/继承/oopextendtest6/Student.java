package com.面向对象高级.继承.oopextendtest6;

public class Student {
    String name;
    int age;

    public Student(){
        this("同学", 18);
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

}
