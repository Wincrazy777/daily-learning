package com.面向对象高级.抽象类.Abstracttest1;

public class Test {
    public static void main(String[] args) {
        //抽象类不能创建对象，但是可以创建子类的对象
        //抽象类不一定有抽象方法
        //作用：为了不让外界创建本类对象
        //抽象类可以有构造方法
        //构造方法的作用：给成员变量赋值
        Cat c = new Cat("小花", "花色");
        System.out.println(c.getName()+","+c.getColor());
        c.eat();
        c.catchmouse();
        Dog d = new Dog("小黑", "黑色");
        System.out.println(d.getName()+","+d.getColor());
        d.eat();
        d.lookhome();
    }

}
