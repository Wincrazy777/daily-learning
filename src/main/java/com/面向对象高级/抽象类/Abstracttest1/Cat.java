package com.面向对象高级.抽象类.Abstracttest1;

public class Cat extends Animal{
    
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }
    
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchmouse() {
        System.out.println("猫抓老鼠");
    }

}
