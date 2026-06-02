package com.面向对象高级.多态.ooptest3;

public class Vehicle {
    private String brand;
    private double speed;

    public Vehicle() {
    }

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getSpeed() {
        return speed;
    }


    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("车辆正在移动，品牌：" + brand + "，速度：" + speed + " km/h");
    }

}
