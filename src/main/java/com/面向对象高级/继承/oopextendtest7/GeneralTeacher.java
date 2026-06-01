package com.面向对象高级.继承.oopextendtest7;

public class GeneralTeacher extends Teacher{
    public GeneralTeacher() {
    }

    public GeneralTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("普通教师正在授课");
    }

}
