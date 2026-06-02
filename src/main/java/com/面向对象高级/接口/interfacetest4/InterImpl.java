package com.面向对象高级.接口.interfacetest4;

public class InterImpl implements Inter{
    //虚方法表
    //    非static 非final 非private
    //    只有虚方法表里面的方法才能够被重写，方法重写的实际意义就是替换了虚方法表中记录方法的内存地址

    //此时相当于接口和实现类里面刚好有两个同名的方法而已，但是不构成重写关系

    public static void method(){
        System.out.println("接口中的静态方法");
    }

}
