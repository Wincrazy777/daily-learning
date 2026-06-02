package com.面向对象高级.接口.interfacetest3;

public interface InterB {
    public default void function(){
        System.out.println("InterB接口中新增的默认方法");
    }
}
