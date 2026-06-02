package com.面向对象高级.多态.ooptest3;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("张三", 20, "男");
        System.out.println(p.getName()+","+p.getAge()+","+p.getGender());
        Bicycle b = new Bicycle("捷安特", 20.0);
        p.drive(b);
        Car c = new Car("丰田", 60.0);
        p.drive(c);

    }

}
