package com.面向对象高级.内部类.oopinnerclass_test2;

public class Test {
    public static void main(String[] args) {
        //private修饰的内部类调用方法
        Outer o = new Outer();
        System.out.println(o.getInstance());
    }

}
