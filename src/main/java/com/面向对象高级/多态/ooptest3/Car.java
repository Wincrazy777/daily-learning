package com.面向对象高级.多态.ooptest3;

public class Car extends Vehicle{

    public Car() {
    }

    public Car(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println("汽车正在移动，品牌：" + getBrand() + "，速度：" + getSpeed() + " km/h");
    }

    public void honk() {
        System.out.println("汽车的喇叭声：嘟嘟嘟");
    }

}
