package com.面向对象高级.接口.interfacetest3;

public class Test {
    public static void main(String[] args) {
    //      接口中的默认方法
    //      为了接口升级而存在的
    //      格式：public default 返回值类型 方法名（参数列表）{....}
    // 1.默认方法不是抽象方法，所以不强制重写，但是如果被重写，重写的时候去掉default
    // 2.public可以被省略，default不能省略
    // 3.如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对方法重写
    InterImpl li = new InterImpl();
    li.function();

    }

}
