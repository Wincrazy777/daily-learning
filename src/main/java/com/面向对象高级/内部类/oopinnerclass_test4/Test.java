package com.面向对象高级.内部类.oopinnerclass_test4;

public class Test {
    public static void main(String[] args) {
        //创建静态内部类的对象
        //只要是静态的东西，都可以用类名调用
        //创建静态内部类的格式：
        //外部类类名.内部类类名 变量名 = new 外部类类名.内部类类名();
        //调用静态方法的格式
        //外部类类名.内部类类名.静态方法名();
        
        //非静态方法
        Outer.Inner oi = new Outer.Inner();
        oi.show1();

        //静态方法
        Outer.Inner.show2();

    }

}
