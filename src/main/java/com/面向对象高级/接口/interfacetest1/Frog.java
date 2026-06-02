package com.面向对象高级.接口.interfacetest1;

public class Frog extends Animal implements Swim{
    
    public Frog() {
    }

    public Frog(String name, String color) {
        super(name, color);
    }
    
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }

}
