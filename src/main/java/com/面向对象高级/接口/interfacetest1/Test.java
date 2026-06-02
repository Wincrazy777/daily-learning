package com.面向对象高级.接口.interfacetest1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙", "绿色");
        System.out.println(f.getName()+","+f.getColor());
        f.eat();
        f.swim();
        Dog d = new Dog("小黑", "黑色");
        System.out.println(d.getName()+","+d.getColor());
        d.eat();
        d.swim();
        Rabbit r = new Rabbit("小白", "白色");
        System.out.println(r.getName()+","+r.getColor());
        r.eat();

    }
    

}
