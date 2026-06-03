package com.面向对象高级.内部类.oopinnerclass_test4;

public class Outer {

    int a =10;
    static int b =20;

    //静态内部类
    static class Inner{
        public void show1(){
            //无法从静态上下文中引用非静态 变量 a
            //先创建外部类对象然后引用内部类
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
            System.out.println("非静态的方法被调用了");
        }
        public static void show2(){
            System.out.println("静态的方法被调用了");
            
        }
    }
}
