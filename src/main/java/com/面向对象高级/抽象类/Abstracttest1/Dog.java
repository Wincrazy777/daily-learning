package com.面向对象高级.抽象类.Abstracttest1;

public class Dog extends Animal{
    
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }
    
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookhome() {
        System.out.println("狗看家");
    }

}
