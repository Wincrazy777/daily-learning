package com.面向对象高级.继承.oopextendtest7;

public class Student extends Person{

    private String grade;

    public Student() {
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void study() {
        System.out.println("学生正在学习");
    }
}
