package com.面向对象高级.多态.ooptest3;



public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void drive(Vehicle vehicle) {
        //表示当前的交通攻击正在行驶
        vehicle.move();
        //响铃，鸣笛
        if(vehicle instanceof Bicycle){
            Bicycle b = (Bicycle) vehicle;
            b.ringBell();
        }else if(vehicle instanceof Car){
            Car c = (Car) vehicle;
            c.honk();
        }else{
            System.out.println("没有这个类型");
        }
    }
}