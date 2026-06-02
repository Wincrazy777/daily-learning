package com.面向对象高级.接口.interfacetest2;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, String age) {
        super(name, age);
    }

    public abstract void teach();

}
