package com.面向对象高级.继承.oopextendtest5;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的空参构造被调用了");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类的实参构造被调用了");
    }
}
