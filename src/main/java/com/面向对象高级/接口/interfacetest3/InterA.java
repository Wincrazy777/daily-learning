package com.面向对象高级.接口.interfacetest3;

public interface InterA {
    public abstract void method1();
    public abstract void method2();

    public default void function(){
        System.out.println("InterA接口中新增的默认方法");
    }

}
