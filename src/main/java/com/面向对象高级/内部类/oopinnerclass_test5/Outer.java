package com.面向对象高级.内部类.oopinnerclass_test5;

public class Outer {

    int b =20;

    public void show(){
        int a =10;

        //局部内部类
        class Inner{
            String name;
            int age;

            public void method1(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类的非静态方法");
            }

            public static void method2(){
                System.out.println("局部内部类的静态方法");
            }
        }

        //创建局部内部类的对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();

    }

}
