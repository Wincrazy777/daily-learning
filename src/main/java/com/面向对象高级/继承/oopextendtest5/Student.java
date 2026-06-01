package com.面向对象高级.继承.oopextendtest5;

public class Student extends Person {
    String grade;
    //空参构造
    public Student() {
        System.out.println("子类的空参构造被调用了");
    }

    //带全部参数构造
    public Student(String name, int age, String grade) {
        //调用父类的构造方法
        super(name, age);
        this.grade = grade;
        System.out.println("子类Student的构造被调用了");
    }
}
