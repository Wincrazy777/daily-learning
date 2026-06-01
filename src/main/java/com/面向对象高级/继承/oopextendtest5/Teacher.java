package com.面向对象高级.继承.oopextendtest5;

public class Teacher extends Person {
    String subject;
    //空参构造
    public Teacher() {
        System.out.println("子类的空参构造被调用了");
    }

    //带全部参数构造
    public Teacher(String name, int age, String subject) {
        //调用父类的构造方法
        super(name, age);
        this.subject = subject;
        System.out.println("子类Teacher的构造被调用了");
    }

}
