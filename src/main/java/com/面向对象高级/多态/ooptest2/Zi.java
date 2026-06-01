package com.面向对象高级.多态.ooptest2;

public class Zi extends Fu {
    String name="Zi";

    public void zishow(){
        System.out.println("子类的zishow方法被调用了");
    }
    @Override
    public void show(){
        System.out.println("子类重写的show方法被调用了");
    }

}
