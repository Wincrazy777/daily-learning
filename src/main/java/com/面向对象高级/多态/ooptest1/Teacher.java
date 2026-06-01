package com.面向对象高级.多态.ooptest1;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("教师的工作是授课");
    }

}
