package com.面向对象高级.接口.interfacetest5;

public interface Inter {
    public default void login(){
        check();
        System.out.println("检查登录的逻辑");
    }
    public default void register(){
        check();
        System.out.println("执行注册的逻辑");
    }

    // jdk8
    // public可以被所有的外界调用，安全性问题
    //public default void check(){
    //    System.out.println("检查网络");
    //    System.out.println("检查用户名和密码的格式");
    //    System.out.println("检查用户名是否存在");
    //}

    //jdk9：提供了私有的方法
    //private 返回值类型 方法名（形参）{方法体}
    private void check(){
        System.out.println("检查网络");
        System.out.println("检查用户名和密码的格式");
        System.out.println("检查用户名是否存在");
    }


    //静态的私有方法
    public static void login1(){
        check1();
        System.out.println("检查登录的逻辑");
    }
    public static void register1(){
        check1();
        System.out.println("执行注册的逻辑");
    }

    private static void check1(){
        System.out.println("检查网络");
        System.out.println("检查用户名和密码的格式");
        System.out.println("检查用户名是否存在");
    }

}
