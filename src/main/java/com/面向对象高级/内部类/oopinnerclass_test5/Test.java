package com.面向对象高级.内部类.oopinnerclass_test5;

public class Test {
    public static void main(String[] args) {
    //外界无法直接使用show方法里面的局部变量a，需要再方法内部创建对象并使用
    //该类可以直接访问外部类的成员，也可以访问方法内的局部变量
    Outer o = new Outer();
    o.show();

    }

}
