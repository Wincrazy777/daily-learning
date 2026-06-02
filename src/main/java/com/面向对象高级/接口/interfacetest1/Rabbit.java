package com.面向对象高级.接口.interfacetest1;

public class Rabbit extends Animal{
    
    public Rabbit() {
    }

    public Rabbit(String name, String color) {
        super(name, color);
    }
    
    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }

}
