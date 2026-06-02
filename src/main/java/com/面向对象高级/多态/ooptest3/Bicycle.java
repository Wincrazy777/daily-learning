package com.面向对象高级.多态.ooptest3;

public class Bicycle extends Vehicle{
    
    public Bicycle() {
    }

    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println("自行车正在移动，品牌：" + getBrand() + "，速度：" + getSpeed() + " km/h");
    }

    public void ringBell() {
        System.out.println("自行车的铃声：叮铃铃");
    }

}
